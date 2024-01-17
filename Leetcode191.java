import java.util.Scanner;

class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n&=(n-1);
            count++;
        }
        return count;
    }

}

public class Leetcode191 {
    public static  void main(String[] args){
        Solution2 s2= new Solution2();
        Scanner sc= new Scanner(System.in);
        int n ;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int output =s2.hammingWeight(n);
        System.out.println(output);
    }
}
