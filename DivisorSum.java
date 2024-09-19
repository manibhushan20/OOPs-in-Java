public interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class DivisorSum {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        
        int n1 = 400;
        int n2 = 700;
        int n3 = 1000;
        
        System.out.println("Divisor sum for n = " + n1 + ": " + myCalculator.divisor_sum(n1));
        System.out.println("Divisor sum for n = " + n2 + ": " + myCalculator.divisor_sum(n2));
        System.out.println("Divisor sum for n = " + n3 + ": " + myCalculator.divisor_sum(n3));
    }
}
