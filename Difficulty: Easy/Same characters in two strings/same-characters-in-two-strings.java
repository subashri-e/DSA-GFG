// User function Template for Java
class Solution {
    int sameChar(String A, String B) {
        int count=0;
        for(int i=0;i<A.length();i++){
            if(Character.toLowerCase(A.charAt(i))==Character.toLowerCase(B.charAt(i))){
                count++;
            }
        }
        return count;
    }
}