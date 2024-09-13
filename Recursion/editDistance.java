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
