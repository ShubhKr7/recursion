/*
 Here we are given two array. One of weights and one to profit.
 We are given a threshold limit of weight.
 Now we have to find the largest value of profit calculated.
int W=4;
int profit[]={1,88,2,3,6};
int weights[]={4,5,1,1,2};
Output: 11
 */

package Recursion;

public class knapsack {
    
    public static int calc(int []profit, int[]weights, int W, int i, int max){
    if(W==0||i==profit.length) 
        return max;
        
    else if(weights[i]>W)  return calc(profit, weights, W, i+1, max);
    else  
         return Math.max(calc(profit, weights, W, i+1, max),
         calc(profit, weights, W-weights[i], i+1,  max+profit[i]));
            
    }

    public static void main(String[] args) {
        int W=4;
        int profit[]={1,2,3};
        int weights[]={4,5,1};
        int res=calc(profit,weights,W,0, 0);
        System.out.println("Res:"+res);
    }
}
