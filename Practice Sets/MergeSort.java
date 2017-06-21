package final_lab;
import java.util.Scanner;

public class MergeSort 
{
    public static void main(String args[])
    {
        
        MS ms = new MS();
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter the array you want to sort\n");
        
        for (int i=0 ; i<arr.length ; i++)
        {
            arr[i] = s.nextInt();
        }
        
        arr = MS.mergeSort(arr);
        
        System.out.println("The sorted array is \n");
        
        for(int j=0 ; j<arr.length ; j++)
        {
            System.out.println(arr[j]+" ");
        }
        
    }
}
    class MS 
    {
    public static int[] mergeSort(int[] list)
    {
        if (list.length <= 1)
        {
            return list;
        }
        
        int[] first = new int[list.length/2];
        int[] second = new int[list.length - first.length];
        
        mergeSort(first);
        mergeSort(second);
        
        merge(first,second,list);
        
        return list;
    }
    
    public static void merge(int[] first, int[] second, int[] result)
    {
        
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        
        while(iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst] < second[iSecond])
            {
                result[j] = first[iFirst];
            }
            else
            {
                result[j] = second[iSecond];
            }
        }
        
        System.arraycopy(first,iFirst, result,j,first.length - iFirst);
        System.arraycopy(second, iSecond, result,j,second.length - iSecond);
        
        
    }
}