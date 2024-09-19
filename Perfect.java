public class Perfect {
    public static void main(String[] args) {
        int sum;
        for (int i = 1; i <= 1000; i++) {
            sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                   }
                }
          if (sum == i) {
          System.out.println(i + " is a perfect number.");
            }
        }
    }
 }
