package onlineround1b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class OnlineRound1B {
    public static void main(String[] args) throws IOException {
        String path="input-small-a.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        
        int testcase = Integer.parseInt(br.readLine());
        int caseNo=1;
        for (int i = 0; i < testcase; i++) {
            String[] D_N_Split = br.readLine().split(" ");
            int destination =  Integer.parseInt(D_N_Split[0]);
            int numberOfHorses = Integer.parseInt(D_N_Split[1]);
            ArrayList<Double> maxOfHorse = new ArrayList<Double>();
            for (int j = 0; j < numberOfHorses; j++) {
                String[] K_S_Split = br.readLine().split(" ");
                
                int currentLocOfHorse = Integer.parseInt(K_S_Split[0]);
                int speedOfHorse = Integer.parseInt(K_S_Split[1]);
                
                double hours = (destination-currentLocOfHorse)/speedOfHorse;
                maxOfHorse.add(hours);
            }
            Collections.sort(maxOfHorse);
            double max = maxOfHorse.get(maxOfHorse.size()-1);
            double threshold = destination/max;
            String format = String.format("%.6f", threshold);
            System.out.println("Case #"+caseNo+": "+format);
            caseNo++;
        }
        
    }
}
