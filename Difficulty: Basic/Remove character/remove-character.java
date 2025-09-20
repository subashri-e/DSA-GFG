// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        Set <Character> st = new HashSet<>();
        for(char c : str2.toCharArray()){
            st.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : str1.toCharArray()){
            if(!st.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}