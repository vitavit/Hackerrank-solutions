import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // 
    static int minimumSwaps(int[] arr) {
        int n=arr.length;
        int swapcount=0;
        int temp=0;
        int idx=0;

            for(int i=0; i<n-1; i++){
                    if(arr[i]!=i+1){
                        for(int j=0; j<n;j++){
                            if(arr[j]==i+1){
                                idx=j; break;
                            }
                        }
                        temp=arr[i];
                        arr[i]=arr[idx];
                        arr[idx]=temp;
                        swapcount++;    
                    }
            }
        
        return swapcount;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
