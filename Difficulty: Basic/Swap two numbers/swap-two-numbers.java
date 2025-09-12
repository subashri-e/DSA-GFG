class Solution {
    static List<Integer> get(int a, int b) {

        a=a+b;
        b=a-b;
        a=a-b;
        List<Integer> li = new ArrayList<>();
        li.add(a);
        li.add(b);
        return li;
    }
}