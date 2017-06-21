package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Armstrong_number {
    public static void main(String args[]) throws FileNotFoundException, IOException{
    
        String path="D:\\Programming Practice\\Input_Armstrong.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
    
        int N,temp,result,input,output;
        String string;
        
        char[] charInput;
        
        ArrayList<String> outputList = new ArrayList<>();
        
        while((string = br.readLine()) != null) {    
            
            output=0;
            outputList.clear();
            N=0;
            
            //string = br.readLine();
            
            charInput = string.toCharArray();
            
            for (int j=0; j<charInput.length; j++) {
              N=charInput.length;
              
              temp=Integer.parseInt(charInput[j]+"");
              result=(int) Math.pow(temp, N);
              
              outputList.add(Integer.toString(result));
            }
            for (int x=0; x<outputList.size(); x++) {
                output += Integer.parseInt(outputList.get(x));
            }
            input = Integer.parseInt(string);
            
            if (ArmstrongCheck(input,output)){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }        
        }
    }
    
    public static boolean ArmstrongCheck(int input, int output){        
        return input == output;
    }
    
}
