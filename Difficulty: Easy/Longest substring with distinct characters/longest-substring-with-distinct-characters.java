//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        int maxLength = 0;
        int left = 0;
        HashMap <Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (map.containsKey(current) && map.get(current) >= left) {
                left = map.get(current) + 1;
            }
            map.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}