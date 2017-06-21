package team243;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Problem7 {
    static int[][] cord;
    static float[][] dp, dist;
    static int[][] parent;
    static int n;
 
    static float TSP(int i, int bitmask, float val, int p) {
        if (bitmask == (1 << n) - 1) {
            return 0;
        } 
        else if (dp[i][bitmask] != -1) {
            return dp[i][bitmask];
        } 
        else {
            dp[i][bitmask] = Float.MAX_VALUE;
            float m, mVal = Float.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (((1 << j) & bitmask) == 0) {
                    m = TSP(j, bitmask | (1 << j) , val + dist[i][j], i) + dist[i][j];
                    if (m <= dp[i][bitmask]) {
                        dp[i][bitmask] = m;
                        if(m + val < mVal){
                            mVal = m + val;
                            parent[i][bitmask] = j;
                        }
                    }
                }
            }
            return dp[i][bitmask];
        }
    }    
    
    public static void main(String args[]) throws NumberFormatException,
            IOException {
        
        String path="C:\\Users\\HP-PC\\Desktop\\Sol\\q7.txt";
        
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        
        Scanner sc = new Scanner(br);
                
        int best = 0;
        double min, curr;
        int c = 1;
        int [][] bestParent;
        
        while ((n = sc.nextInt()) != 0) {
            min = Double.MAX_VALUE;
            dp = new float[n][1 << (n + 1) - 1];
            dist = new float[n][n];
            cord = new int[n][2];
            parent = new int[n][1 << (n + 1) - 1];
            bestParent = new int[n][1 << (n + 1) - 1];
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[0].length; j++) {
                    dp[i][j] = -1;
                }
            }
            for (int i = 0; i < n; i++) {
                cord[i][0] = sc.nextInt();
                cord[i][1] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int x, y;
                    x = Math.abs(cord[i][0] - cord[j][0]);
                    y = Math.abs(cord[i][1] - cord[j][1]);
                    dist[i][j] = (float) (Math.sqrt(x * x + y * y) + 16);
                }
            }
            for (int i = 0; i < n; i++) {
                curr = TSP(i, 1 << i, 0,0);
                if (curr < min) {
                    best = i;
                    min = curr;
                    for (int j = 0; j < bestParent.length; j++) {
                        for (int k = 0; k < bestParent[0].length; k++) {
                            bestParent[j][k] = parent[j][k];
                        }
                    }
                }
            }
            System.out.println("**********************************************************");
            System.out.println("Network #" + c++);
            int bitmask = 1 << best;
            for (int i = 0; i < n - 1; i++) {
                int adj = bestParent[best][bitmask];
                System.out.printf("Cable requirement to connect (%d,%d) to (%d,%d) is %.2f feet.\n",
                                cord[best][0], cord[best][1], cord[adj][0],
                                cord[adj][1], dist[best][adj]);
                bitmask |= 1 << adj;
                best = adj;
            }
            System.out.printf("Number of feet of cable required is %.2f\n", min);
        }
    }
}