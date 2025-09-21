class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\.+");
        List<String> li = new ArrayList<>();
        for(String w : arr){
            if(!w.isEmpty()){
                li.add(w);
            }
        }
        Collections.reverse(li);
        return String.join(".",li);
        
    }
}
