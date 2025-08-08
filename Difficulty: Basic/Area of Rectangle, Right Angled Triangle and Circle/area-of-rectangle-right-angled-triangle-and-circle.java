// User function Template for Java

class Solution {
    static int[] getAreas(int L, int W, int B, int H, int R) {
        // code here
        int rect = L*W;
        int tri = (int)(0.5*B*H);
        int circle = (int)(3.14*R*R);
        return new int[] {rect,tri,circle};
    }
};