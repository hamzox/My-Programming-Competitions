package snackdownpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SnakeProcession {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int noOfReports = in.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < noOfReports; i++) {
            int length = in.nextInt();
            String inputString = in.next();
            arr.add(inputString);
        }
        for (int i = 0; i <arr.size(); i++) {
            if (checkString(arr.get(i))) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
    public static boolean checkString(String input) {
        boolean result=false;
        if (!input.contains("H") && !input.contains("T")) {
            result = true;
            return result;
        }
        else {
            if(checkSplitString(splitDot(input))) {
                result=true;
            }
            else {
                result=false;
            }
        }
        return result;
    }
    public static boolean checkSplitString(String input){
        boolean result=false;
        if (input.length()%2 ==0) {
            for (int i = 0; i < input.length(); i+=2) {
                if (input.charAt(i)=='H' && input.charAt(i+1)=='T') {
                    result= true;
                }
                else {
                    result=false;
                    break;
                }
                
            }
        }
        else {
            result=false;
        }
        return result;
    }
    public static String splitDot(String input) {
        String result="";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != '.') {
                result+=input.charAt(i)+"";
            }
        }
        return result;
    }    
}
