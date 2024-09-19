import java.util.*;

public class freqFind {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the separation between plates:");
        float a = sc.nextFloat();
        double freq = 3 * Math.pow(10, 8) / (2 * a);
        System.out.println("For the separation between plates of " + a + " the cutoff frequency is: " + freq);
    }
}
