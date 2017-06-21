
package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class f91 {
    public static void main(String args[]) throws FileNotFoundException, IOException{
    
        String path="C:\\Users\\HP-PC\\Desktop\\input.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
    
        String string;
        int N;
        
        while ((string = br.readLine()) != null) {
            N = Integer.parseInt(string);
            if (N!=0) {     
                System.out.println(f91(N));   
            }
        }
    }
    public static int f91(int N) {
        int n=N;
        if (n <= 100) {
            n = f91(f91(n+11));
        }
        else if (n>=101) {
            n=n-10;
        }   
        return n;
    }
}
