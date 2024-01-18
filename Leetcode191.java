import java.util.Scanner;
public class Leetcode191 {
    // you need to treat n as an unsigned value
        static int hammingWeight(int n) {
            int count=0;
            while(n!=0){
                n&=(n-1);
                count++;
            }
            return count;
        }
    public static  void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n ;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int output = hammingWeight(n);
        System.out.println(output);
    }
}
