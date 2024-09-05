/*
 Here we have to find in how many min operations can 2 strings s1 adn s2 become equal.
 Insertion 
 deletion
 Replacement
 Input:
 SUNDAY
 SATURDAY
 output:3
 */

package Recursion;

public class editDistance {
    
    public static int min(String s1, String s2){
        int res=0;
        res=recur(s1,s2,s1.length()-1,s2.length()-1);
        return res;
    }

    // public static int recur(String s1, String s2, int S1, int S2, int min){
        // if(S1==s1.length()&&S2==s2.length()) return min;
        // else if(S1==s1.length()-1&&S2!=s2.length()-1&&s1.charAt(S1)==s2.charAt(S2)) return recur(s1, s2, S1, S2+1, min);
        // else if(S1==s1.length()-1&&S2!=s2.length()-1&&s1.charAt(S1)!=s2.charAt(S2)) return recur(s1, s2, S1+1, S2, min+1);
        // else if(S1!=s1.length()-1&&S2==s2.length()-1&&s1.charAt(S1)==s2.charAt(S2)) return recur(s1, s2, S1+1, S2, min);
        // else if(S1!=s1.length()-1&&S2==s2.length()-1&&s1.charAt(S1)!=s2.charAt(S2)) return recur(s1, s2, S1+1, S2, min+1);
        // else if(s1.charAt(S1)==s2.charAt(S2))
        // return recur(s1,s2,S1+1,S2+1,min);
        // else if(s1.charAt(S1)!=s2.charAt(S2)) recur(s1, s2, S1+1, S2+1, min+1);
        // return min;
    // }

    public static int  recur(String a, String b, int m, int n){
        if(n==-1 || m==-1){
            return m+n+2;
        }
        if(a.charAt(m)==b.charAt(n)){
            return recur(a,b,m-1,n-1);
        }else{
            return Math.min(recur(a,b,m-1,n-1),Math.min(recur(a,b,m-1,n),recur(a,b,m,n-1)))+1;
        }
    }

    public static void main(String[] args) {
        String s1="SUNDAY";
        String s2="SATURDAY";
        int res=min(s1,s2);
        System.out.println("Res:"+res);
    }
}
