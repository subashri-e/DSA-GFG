class Solution {
    boolean isBinary(String s) {
        for(char c : s.toCharArray()){
            if(c!='0' && c!='1'){
                return false;
            }
        }
        return true;
    }
}