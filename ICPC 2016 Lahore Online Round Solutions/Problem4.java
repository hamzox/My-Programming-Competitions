
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String path="q4.txt";
        FileReader fr = new FileReader(path); 
        BufferedReader br = new BufferedReader(fr);
        
        String input;
        
        String inputSplit[];
       
        BigInteger m,n;
        
        while ((input=br.readLine()) != null) {
        
            inputSplit = input.split(", ");
            
            m = new BigInteger(Integer.parseInt(inputSplit[0])+"");
            n = new BigInteger(Integer.parseInt(inputSplit[1])+"");
        
            try {
            System.out.println(gcd(m,n));
            }
            catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }

        } 
        
    //        Scanner console = new Scanner(System.in);
    //        int a = console.nextInt();
    //        int b = console.nextInt();
    //       int z =  gcd (a, b);
    //        System.out.println(z);
        }
    static BigInteger gcd(BigInteger a,BigInteger b)
    {
        BigInteger zero =new BigInteger("0");
      if(a.equals(zero) || b.equals(zero)) return a.add(b); // base case
      return gcd(b,a.mod(b));
    }
    
}