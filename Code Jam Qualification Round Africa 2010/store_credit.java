package srcPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class srcMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String path = "input_credit.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		int testcase = Integer.parseInt(br.readLine());		
		int caseNo = 1;
		for (int i = 0; i < testcase; i++) {
			int cash_i = Integer.parseInt(br.readLine());
			int noOfItems = Integer.parseInt(br.readLine());
			ArrayList<Integer> items = new ArrayList<Integer>();
			String[] stringSplit = br.readLine().split(" ");
			for (int item_i=0; item_i<noOfItems ; item_i++) {
				items.add(Integer.parseInt(stringSplit[item_i]));
			} 	
			int[] arr =getCreditSum(items, cash_i);
			Arrays.sort(arr);
			System.out.println("Case #"+caseNo+": "+arr[0]+" "+arr[1]);
			caseNo++;
		}
	}
	public static int[] getCreditSum(ArrayList<Integer> inputArray, int cash_i) {
		int[] result = new int[2];
		for (int i = 0; i < inputArray.size()-1; i++) {
			int item_i = inputArray.get(i);
			for (int j = 1; j < inputArray.size(); j++) {
				int item_k = inputArray.get(j);
				int sum =item_i+item_k;
				if (sum == cash_i) {
					result[0] = i+1;
					result[1] = j+1;
					break;
				}
			}	
		}
		return result;
	} 
}