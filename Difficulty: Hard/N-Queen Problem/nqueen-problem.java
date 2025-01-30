//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if (ans.size() == 0)
                System.out.println("-1");
            else {
                ans.sort((list1, list2) -> {
                    int size = Math.min(list1.size(), list2.size());
                    for (int i = 0; i < size; i++) {
                        if (!list1.get(i).equals(list2.get(i))) {
                            return list1.get(i) - list2.get(i);
                        }
                    }
                    return list1.size() - list2.size();
                });

                for (int i = 0; i < ans.size(); i++) {
                    System.out.print("[");
                    for (int j = 0; j < ans.get(i).size(); j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solveNQueens(n, 0, new ArrayList<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), result);
        return result;
    }
    
    private void solveNQueens(int n, int col, List<Integer> board, Set<Integer> diagonals, Set<Integer> antiDiagonals, Set<Integer> rows, ArrayList<ArrayList<Integer>> result) {
        if (col == n) {
            result.add(new ArrayList<>(board));
            return;
        }
        for (int row = 1; row <= n; row++) {
            int diagonal = col - row;
            int antiDiagonal = col + row;
            if (rows.contains(row) || diagonals.contains(diagonal) || antiDiagonals.contains(antiDiagonal)) continue;
            board.add(row);
            rows.add(row);
            diagonals.add(diagonal);
            antiDiagonals.add(antiDiagonal);
            solveNQueens(n, col + 1, board, diagonals, antiDiagonals, rows, result);
            board.remove(board.size() - 1);
            rows.remove(row);
            diagonals.remove(diagonal);
            antiDiagonals.remove(antiDiagonal);
        }
    }
}
