import java.util.*;

public class PrimeNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        boolean fact = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                fact = false;
                break;
            }
        }
        if (fact)
            System.out.println(n + " is a prime number!!");
        else
            System.out.println(n + " is not a prime number!!");
    }
}
