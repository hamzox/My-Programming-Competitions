package practice;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PointStorage {
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        
        String path ="D:\\UBIT\\Depth and Core Courses\\6th Semester\\Computer Graphics\\Coordinates.txt";
        
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
    
        ArrayList<String> PointStorage = new ArrayList<>();
        
        ArrayList<Integer> xStorage = new ArrayList<>();
        ArrayList<Integer> yStorage = new ArrayList<>();

        int testcase = Integer.parseInt(br.readLine());
        
        String stringInput;
        String[] inputSplit;
        
        for (int i = 0; i < testcase; i++) {

            stringInput=br.readLine();      
            PointStorage.add(stringInput);
        }
        
        int x,y;
        int maxX=0,maxY=0,minY=0,minX=0;
        
        for (int i = 0; i < PointStorage.size(); i++) {
            inputSplit = PointStorage.get(i).split(",");
            
            x=Integer.parseInt(inputSplit[0]);
            y=Integer.parseInt(inputSplit[1]);
        
            xStorage.add(x);
            yStorage.add(y);
        }
        
        Collections.sort(xStorage);
        Collections.sort(yStorage);
        
        maxX=xStorage.get(0);
        maxY=yStorage.get(0);
        
        minX=xStorage.get(xStorage.size()-1);
        minY=yStorage.get(yStorage.size()-1);
        
        System.out.println("***BOUNDING BOX COORDINATES***");
        
        System.out.println("Max X: "+maxX);
        System.out.println("Max Y: "+maxY);
        System.out.println("Min X: "+minX);
        System.out.println("Min Y: "+minY);
        
        //DisplayPoints(PointStorage);
        
    }
    public static void DisplayPoints(ArrayList<String> input) {
        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }
    }
}
