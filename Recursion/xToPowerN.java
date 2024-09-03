/*
Here I have done a lot of recursive basic questions. If you are trying to study recursion then you can definetly study from this repo. Try each question by yourself. The main function might need some of your attention as it is messy and not perfectly commented out. I won't write comments for each function calling in main method as it will be unecessary. If you are trying to learn to code try to understand the main function on your own!
*/
package Recursion;

public class xToPowerN {
    
    //Here we to calculate x raised to the power n using recursion.
    //Using formula product = x * x^(n-1)
    public static int power(int x, int n){
        if(n==0) return 1;
        return x*power(x, n-1);
    }

    //Here we to calculate x raised to the power n using recursion.
    //Using formula product = x^(n/2) * x^(n/2)
    public static int newPower(int x, int n){
        if(n==0) return 1;
        if(n%2==0) 
            return newPower(x,n/2)*newPower(x,n/2);
        return newPower(x,n/2)*newPower(x,n/2)*x;
    }

    //Print an array using recursion
    public static void printRecur(int []nums, int i){
        if(i==nums.length) return;
        System.out.println(nums[i]);
        printRecur(nums, i+1);
    }

    //Print an array in reverse order
    public static void revPrint(int []nums, int i){
        if(i==nums.length) return;
        revPrint(nums, i+1);
        System.out.println(nums[i]);
    }

    //Print Max in an array
    public static void maxRecur(int []nums, int i){
        if(i==nums.length-1) return;
        else if(nums[i]>nums[i+1]){
            int temp=nums[i+1];
            nums[i+1]=nums[i];
            nums[i]=temp;
        }
        maxRecur(nums, i+1);
    }

    //Print First occurence of an element in an array
    public static void firstOccurence(int []nums, int i, int target){
        if(i==nums.length) {System.out.println(-1);return;}
        else if(target==nums[i]) {System.out.println(i); return;}
        else
            firstOccurence(nums, i+1, target);
    }

    //Find the last index of an occurence in an array
    public static void lastOccurence(int []nums, int i, int target){
        int res=recurLast(nums, i, target, -1);
        if(res!=-1)
        System.out.println(res);
        else System.out.println("Element not found");
    }

    //recursive function for lastOccurence
    public static int recurLast(int []nums, int i, int target, int last){
        if(i==nums.length&&last!=-1) return last;
        else if(i==nums.length) return -1;
          if(nums[i]==target&&i>last)
             return recurLast(nums, i+1, target,i);
        return recurLast(nums, i+1, target, last);
    }

    //Finding all indices in an array
    public static void allIndices(int []nums, int i,int target){
        if(i==nums.length) return;
        else if(nums[i]==target) System.out.print(i+" ");
        allIndices(nums, i+1, target);
    }

    //Finding all the subsequesnces of a string
    public static void subSequence(String s, int i, String c){
        if(i==s.length()&&c.length()!=0) {System.out.println(c);return;}
        else if(i==s.length()) return;
        else {
            subSequence(s, i+1, c);
            c+=s.charAt(i);
            subSequence(s, i+1, c);
        }

    }
    public static void main(String[] args) {
        // int x=2,n=5;
        // int nums[]={1,41,4,3,48,3,6,54,783,3};
        // int res=newPower(x, n);
        // printRecur(nums, 0);
        // revPrint(nums, 0);
        // maxRecur(nums, 0);
        // System.out.println(nums[nums.length-1]);
        // System.out.println("Res:"+res);
        // firstOccurence(nums, 0, 466);
        // lastOccurence(nums, 0, 6);
        // allIndices(nums, 0, 3);
        subSequence("ABCD", 0, "");
    }
}
