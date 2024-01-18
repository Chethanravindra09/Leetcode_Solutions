import java.util.Scanner;

public class Leetcode231 {
    static boolean isPowerOfTwo(int n) {

        for(int i =0;i<=30;i++){
            double num= Math.pow(2,i);
            if(num==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
       boolean complement = isPowerOfTwo(n);
        System.out.println(" Is power of two given number is " + complement);
    }
}
