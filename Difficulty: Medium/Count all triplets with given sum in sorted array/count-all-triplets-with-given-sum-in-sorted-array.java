//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            int target = Integer.parseInt(sc.nextLine());

            Solution ob = new Solution();
            int ans = ob.countTriplets(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int count = 0;
        int n = arr.length;
        
        for (int i = 0; i < n ; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    int t1=arr[left], c1=0, t2=arr[right], c2=0;
                    while(left<=right && arr[left]==t1){
                        left++;
                        c1++;
                    }
                    while(left<=right && arr[right]==t2){
                        right--;
                        c2++;
                    }
                    count += (t1==t2) ? (c1*(c1-1))/2 : c1*c2;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
}