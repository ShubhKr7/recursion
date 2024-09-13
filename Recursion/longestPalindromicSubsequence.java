/*
 Return the longest palindromic subsequence in a given string
 string = BBABCBCAB
 output: 3
 */

package Recursion;

public class longestPalindromicSubsequence {
    
    public static int recur(String s, int start, int end){
        if(start>end) return 0;
        else if(start==end) return 1;
        else if(s.charAt(start) == s.charAt(end))
        return recur(s, start+1, end-1) + 2;
        else
            return Math.max(recur(s, start+1, end),recur(s, start, end-1));
    }

    public static void main(String[] args) {
        String s = "BBABCBCAB";
        int res=recur(s, 0, s.length()-1);
        System.out.println("Res:"+res);
    }
}
