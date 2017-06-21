
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "q2.txt";

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String input;
        long n;
        while ((input = br.readLine()) != null) {
            n = Integer.parseInt(input);
            
            int size = (int) n;
            double sum = 0;
            int l = (int) n - 3, nt = 0, add = 3;
            double arr[] = new double[size];
            int arr1[] = new int[size];
            arr[0] = 2;
            arr[1] = 4;
            arr[2] = 6;

            while (nt < l) {
                for (int i = 0 + nt; i < add; i++) {
                    sum += arr[i];
                }
                arr[add] = sum / 3;
                add += 1;
                nt++;
                sum = 0;
            }

            for (int i = 0; i < arr.length; i++) {
                
                arr1[i] = (int) arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr1[i] - arr[i] == 0) {
                    System.out.println(arr1[i]);
                } else {
                    System.out.printf("%.2f", arr[i]);
                    System.out.println("");
                }
            }

        }

    }

}
