// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left=0;
        int n=arr.length-1;
        while(left<n){
            char temp=arr[left];
            arr[left]=arr[n];
            arr[n]=temp;
            left++;
            n--;
        }
        return new String(arr);
        
    }
}