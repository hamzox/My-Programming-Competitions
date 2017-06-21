
package team243;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        String path="C:\\Users\\HP-PC\\Desktop\\Sol\\q1.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        
        String string=br.readLine();
        
        long a= Integer.parseInt(string);
        long i = a,p;
        int count = 0;
        boolean b = false;
        if (a < 3) {
            System.out.println("0");
        } else {
            while (i > 0) {
                if (a % i == 0) {
                    count++;
                }
                i--;
            }
            if (count >= 3) {
                b = true;
                //System.out.println("y");
            }
        }
        
        count = 0;
        int ar= 0;
        
        int size = (int) a ;
        int arr[] = new int[size];
        if (b) {
            p = a;

            while (p > 0) {
                boolean isPrime = true;
                int num = (int) p;
                int temp;

                for (int s = 2; s <= num /2; s++) {
                    temp = num % s;
                    if (temp == 0) {
                        isPrime = false;
                        break;
                    }
                }
                //If isPrime is true then the number is prime else not
                if (isPrime) {
                    if(num==1)
                    {}
                    else{
                    arr[ar] = num;
                    ar++;}
                    //System.out.println(num + " is Prime Number");
              } //else {
//                    System.out.println(num + " is not Prime Number");
//                }

                p--;
            }
        }
    Arrays.sort(arr);
    for(int k = 0 ; k <arr.length;k++)
    {
    if(arr[k]==0)
    {
    }
    else
        if (k<arr.length-1){
            System.out.print(arr[k]+", ");
        }
        else {
                System.out.print(arr[k]);
        }
    } 
        
    }
    
    

}
