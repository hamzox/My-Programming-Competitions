
package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class FibModified {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger ti=in.nextBigInteger();
        BigInteger tiNext=in.nextBigInteger();
        int n=in.nextInt();
        
        BigInteger res = fiboMod(ti, tiNext, n);
        System.out.println(res);
        
    }
    public static BigInteger fiboMod(BigInteger t1,BigInteger t2,int n){
        n = n-1;
        if(n == 1){
            return t2;
        }
        return fiboMod(t2,t2.pow(2).add(t1),n);
    }
}
