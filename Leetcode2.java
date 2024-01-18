import java.util.Scanner;

public class Leetcode2 {

    static int reverse(int x){
        int num=x;
        int sum=0;
        while(x!=0){
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int reversenum= reverse(n);
        System.out.println("Reverse of given number is "+reversenum);
    }

}
