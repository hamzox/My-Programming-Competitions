
package snackdownpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SnackDownTemplea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        
        for (int i = 0; i < testcase; i++) {
            int noOfParts = in.nextInt();
            ArrayList<Integer> parts = new ArrayList<>();
            for (int j = 0; j < noOfParts; j++) {
                int hi = in.nextInt();
                parts.add(hi);
            }
            if (noOfParts%2 != 0) {
                int divideList = noOfParts/2;
                if (parts.get(0)==1 && parts.get(parts.size()-1)==1) {
                    if (checkArrayDiff(parts)) {
                        if (checkLeftSide(parts, divideList) && checkRightSide(parts, divideList)) {
                            System.out.println("yes");
                        }
                        else {
                            System.out.println("no");
                        }
                    }
                    else {
                        System.out.println("no");
                    }
                }
                else {
                    System.out.println("no");
                }
            }
            else {
                System.out.println("no");
            }
        }
    }
    public static boolean checkArrayDiff(ArrayList arr) {
        boolean result=false;
        int i =0;
        int j =1;
        while(i!=arr.size()-2 && j!=arr.size()-1) {
            int diff=  Math.abs((int) arr.get(j)- (int) arr.get(i));
            if (diff != 1) {
                result = false;
                break;
            }
            else {
                result=true;
            }
            i++;
            j++;
        }
        return result;
    }
    public static boolean checkLeftSide(ArrayList arr, int divideVal) {
        ArrayList<Integer> newArr = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();
        
        for (int i = 0; i < divideVal; i++) {
            newArr.add((Integer) arr.get(i));
        }
        sorted = newArr;
        Collections.sort(sorted);
        
        return sorted == newArr;
    }
    public static boolean checkRightSide(ArrayList arr, int divideVal) {
        boolean result=false;
        ArrayList<Integer> newArr = new ArrayList<>();
        ArrayList<Integer> reverseSorted = new ArrayList<>();
        for (int i = arr.size()-1; i>divideVal ; i--) {
            newArr.add((Integer) arr.get(i));    
        }
        reverseSorted=newArr;
        Collections.sort(reverseSorted);
        return reverseSorted==newArr;
    }
}
