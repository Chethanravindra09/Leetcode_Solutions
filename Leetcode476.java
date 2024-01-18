import java.util.Scanner;

public class Leetcode476 {
    static int bitwiseComplement(int n) {
        int m = n;
        int mask = 0;
        if (n == 0) {
            return 1;
        }
        while (m != 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }
        int ans = (~n) & mask;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int complement = bitwiseComplement(n);
        System.out.println(" complement of given number is " + complement);
    }
}

