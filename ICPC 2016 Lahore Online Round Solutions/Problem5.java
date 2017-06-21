import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Problem5 {

public static void main(String args[]) throws FileNotFoundException, IOException {
    
        String path="q5.txt";
        
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
    
        BigInteger m,n;
       
        String[] inputSplit;
        String string;
        
        BigInteger max,min,x,lcm;
        
        while ((string = br.readLine()) != null) {
            lcm = new BigInteger(0+"");
            inputSplit = string.split(", ");
            
            m = new BigInteger(Integer.parseInt(inputSplit[0])+"");
            n = new BigInteger(Integer.parseInt(inputSplit[1])+"");
       
            if (m.compareTo(n)>0) {
                max=m;
                min=n;
            }
            else {
                max=n;
                min=m;
            }
            for(int i=1; i<=min.intValue(); i++)
            { 
                BigInteger f=new BigInteger(i+"");
                x=max.multiply(f);
                BigInteger k=(x.mod(min));
                if(k.compareTo(new BigInteger(0+""))==0)
                {
                    lcm=x;
                    break;
                }
            }
            System.out.println(lcm);
        }
    }    
}
