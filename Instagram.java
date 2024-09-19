import java.util.*;

class Instagram {
    private Map<Integer, Set<Integer>> followers; // Map to store followers for each user
    private Map<Integer, List<Integer>> posts;    // Map to store posts for each user
    private Map<Integer, Integer> stories;        // Map to store stories for each user

    public Instagram() {
        followers = new HashMap<>();
        posts = new HashMap<>();
        stories = new HashMap<>();
    }

    public void post(int userId, int postId) {
        // Add the post to the user's posts
        if (!posts.containsKey(userId)) {
            posts.put(userId, new ArrayList<>());
        }
        posts.get(userId).add(postId);
    }

    public List<Integer> feed(int userId) {
        List<Integer> feed = new ArrayList<>();
        if (posts.containsKey(userId)) {
            feed.addAll(posts.get(userId)); // Add user's posts to the feed
        }
        // Add followed users' posts to the feed
        if (followers.containsKey(userId)) {
            for (int followedUser : followers.get(userId)) {
                if (posts.containsKey(followedUser)) {
                    feed.addAll(posts.get(followedUser));
                }
            }
        }
        Collections.sort(feed, Collections.reverseOrder()); // Sort by postId (recent posts first)
        return feed;
    }

    public void follow(int userId1, int userId2) {
        // Add userId2 to the followers of userId1
        if (!followers.containsKey(userId1)) {
            followers.put(userId1, new HashSet<>());
        }
        followers.get(userId1).add(userId2);
    }

    public void unfollow(int userId1, int userId2) {
        // Remove userId2 from the followers of userId1
        if (followers.containsKey(userId1)) {
            followers.get(userId1).remove(userId2);
        }
    }

    public void upload_story(int userId, int storyId) {
        // Update the user's story
        stories.put(userId, storyId);
    }

    public List<Integer> getStories(int userId) {
        List<Integer> storyList = new ArrayList<>();
        // Add the user's story, if any
        if (stories.containsKey(userId)) {
            storyList.add(stories.get(userId));
        }
        // Add followed users' stories, if any
        if (followers.containsKey(userId)) {
            for (int followedUser : followers.get(userId)) {
                if (stories.containsKey(followedUser)) {
                    storyList.add(stories.get(followedUser));
                }
            }
        }
        Collections.sort(storyList, Collections.reverseOrder()); // Sort by storyId (latest story first)
        return storyList;
    }

    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        instagram.post(1, 101);
        instagram.post(2, 102);
        instagram.post(2, 103);
        instagram.post(3, 104);
        instagram.follow(1, 2);
        instagram.follow(1, 3);
        instagram.follow(2, 3);
        instagram.upload_story(1, 201);
        instagram.upload_story(2, 202);
        instagram.upload_story(3, 203);
        System.out.println("User 1's feed: " + instagram.feed(1));
        System.out.println("User 2's feed: " + instagram.feed(2));
        System.out.println("User 3's feed: " + instagram.feed(3));
        System.out.println("User 1's stories: " + instagram.getStories(1));
        System.out.println("User 2's stories: " + instagram.getStories(2));
        System.out.println("User 3's stories: " + instagram.getStories(3));
    }
}
