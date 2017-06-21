
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
        String path="q3.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        
        String string;
        long m,n;
        
        String[] inputSplit;
        
        while ((string = br.readLine()) != null) {            
            inputSplit = string.split(", ");
            
            m = Integer.parseInt(inputSplit[0]);
            n = Integer.parseInt(inputSplit[1]);
            
            int a = (int)(Math.pow(m,n));
            
            System.out.println(a);
        }
        
        
    } 
}
