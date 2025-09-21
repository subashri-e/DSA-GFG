// User function Template for Java

class Solution {
    public String convert(String s) {
        StringBuilder res = new StringBuilder();
        String[] arr = s.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            String w = arr[i];
            if (w.length() > 0) {
                res.append(Character.toUpperCase(w.charAt(0)));
                if (w.length() > 1) {
                    res.append(w.substring(1));
                }
            }
            if (i < arr.length - 1) {
                res.append(" ");
            }
        }
        
        return res.toString();
    }
}
