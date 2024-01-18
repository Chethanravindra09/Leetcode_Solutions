import java.util.Scanner;

public class Leetcode1281 {
    static int subtractProductAndSum(int n) {

        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n = n / 10;
        }

        return (prod - sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();
        int output = subtractProductAndSum(n);
        System.out.println(output);
    }
}
