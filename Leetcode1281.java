import java.util.Scanner;

class Solution {
    public int subtractProductAndSum(int n) {

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
}

public class Leetcode1281 {

    public static void main(String[] args){
        Solution s1= new Solution();
        Scanner sc= new Scanner(System.in);
        int n ;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int output =s1.subtractProductAndSum(n);
        System.out.println(output);
    }
}
