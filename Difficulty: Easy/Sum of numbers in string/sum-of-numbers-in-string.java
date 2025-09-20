class Solution {
    public int findSum(String s) {
        int sum=0;
        int num=0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else{
                sum+=num;
                num=0;
            }
        }
        sum+=num;
        return sum;
    }
}