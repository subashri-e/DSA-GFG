//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            System.out.println(obj.subarrayXor(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        long count = 0;
        int xor = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            xor ^= num;

            // If current XOR equals k
            if (xor == k) {
                count++;
            }

            // If (xor ^ k) exists in the map, add its frequency to the count
            if (freqMap.containsKey(xor ^ k)) {
                count += freqMap.get(xor ^ k);
            }

            // Store the frequency of current XOR
            freqMap.put(xor, freqMap.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}