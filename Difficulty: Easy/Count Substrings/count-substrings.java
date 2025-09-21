// User function Template for Java

class Solution {
    int countSubstr(String S) {
        int count=0;
        for(char c : S.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        return count*(count-1)/2;
        
    }
}