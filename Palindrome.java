import java.util.*;

public class Palindrome 
          {
    public static void main(String[] args) 
                 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        int j = input.length() - 1;
        boolean flag = true;
        
        for (int i = 0; i < input.length()/2; i++) 
                  {
            if (input.charAt(i) != input.charAt(j)) {
                flag = false;
                break;
                 }
            j--;
        }

        if (flag) {
            System.out.println("The given string is a palindrome!");
        } else {
            System.out.println("The given string is not a palindrome!");
        }
    }
}
