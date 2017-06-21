
package codechef;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class codechef_prac7 
{
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        
        FileReader fr = new FileReader("D:\\CodeChef\\Input_NextPalindrome.txt");
        BufferedReader br = new BufferedReader(fr);
        
        //functions f = new functions();
        int tempInt=0;
        boolean isPalindrome=false;
    
        String reverse="";
        String tempString="";
        //
        String line="";
        line = br.readLine();
        
        int testCases = Integer.parseInt(line);
        int tc=0;
        
        while((line = br.readLine()) != null && tc < testCases)
        {
            tempInt = Integer.parseInt(line);
            isPalindrome=false;
            tempString="";
            
            //i = Integer.parseInt(reverse);
            while(isPalindrome != true)
            {
                reverse="";
                tempInt++;

                tempString = Integer.toString(tempInt);

                for (int j=tempString.length()-1; j >= 0; j--)
                {
                    reverse = reverse+tempString.charAt(j);
                }

                if(tempString == reverse)
                {
                    isPalindrome = true;
                    line = tempString;
                }
                else
                {
                    isPalindrome = false;
                    tempInt = Integer.parseInt(tempString);
                }
            }
            //f.NextPalindrome(line);
            System.out.println(line);
            tc++;
        }
        //f.NextPalindrome("817");
    }
}