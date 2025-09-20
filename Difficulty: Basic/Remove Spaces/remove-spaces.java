// User function Template for Java
class Solution {

    String modify(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c!=' '){
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}