package codechef;
import java.util.Scanner;

public class SentenceCipher 
{
    public static void main(String args[])
    {
        String string;//source text
        
        String encrypt;//case '1' 
        String replace;
        
        String decrypt;//case '2'
        String positions ="";
        int dec;
        
        int choice;
        int temp=0;
        int tempa=0;
        int p=0;
        int q=0;
        int pos=0;
        double count=0;
        double InformationLost = 0;
        
        String results="";
        
        System.out.println("Sentence Cipher");
        System.out.print("Enter source text: ");
        
        Scanner scan = new Scanner(System.in);
        Scanner s =new Scanner(System.in);
        
        string = scan.nextLine();
        string.toLowerCase();
        
        System.out.println("1. Encrypt?");
        System.out.println("2. Decrypt?");
        
        choice = scan.nextInt();
            if (choice == 1)
            {
                System.out.println("Enter a word to encrypt.");
                encrypt = s.nextLine();
                
                for(int k=0; k < encrypt.length(); k++)
                {
                    for(int i =temp ; i<string.length() ; i++ )
                    {
                        if(encrypt.charAt(k) == string.charAt(i))
                        {
                            results += string.indexOf(string.charAt(i));
                            results = results + " ";
                            temp=0;
                            break;
                        }
                        else if (encrypt.charAt(k) != string.charAt(i) && !string.contains(""+encrypt.charAt(k)))
                        {
                            replace = "-1 ";
                            results = results+replace;
                            count++;
                            break;
                        }
                        else
                        {
                            temp = temp;
                        }
                    }
                }   
                results = results + "-2";
                results.toLowerCase();
                InformationLost = (count/results.length())*100 + 0.0;
                System.out.print(results);
                System.out.println("");
                System.out.println("Information lost: "+InformationLost);
            }
            else if (choice == 2)
            {
                replace ="";
                results="";
                System.out.println("Enter the positions to decrypt.");
                decrypt = s.nextLine();
                
                while(p != decrypt.length())
                {
                    if (decrypt.charAt(p) == ' ')
                    {
                        p++;
                    }
                    else 
                    {
                        positions += decrypt.charAt(p);
                        p++;
                    }
                }
                q=0;
                while (q != positions.length()-2)
                {
                    if (positions.charAt(q) == '-')
                    {
                        replace = "_";
                        results += replace;
                        count++;
                        q++;
                        q++;
                    }
                    else 
                    {
                        results += string.charAt(Integer.parseInt(positions.charAt(q)+""));
                        q++;
                    }
                }
                System.out.println(results);
                InformationLost = (count/results.length())*100 + 0.0;
                System.out.println("InformationLost: "+InformationLost);
            }
            else
            {
                System.out.println("Please enter in 1 or 2.");
            }
    }
}
