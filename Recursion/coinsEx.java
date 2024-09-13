/*
 Here our question is that we have to find the minimum number of coins required to make a desired sum
 target. We have to do this question with using recursion inside a loop.
 */

package Recursion;

public class coinsEx {

    //Counting number of coins
    static int numberOfCoins=0;

    //Recursive function to count how many times a coin can be used to add up to the target
    public static int minCoins(int []coins, int target, int i){

        //if coin is greater than target then return the target and dont use any coin
        if(coins[i]>target) return target;

        //otherwise use that coin
        numberOfCoins+=1;

        //again call the function recursively by subtracting that coin from the target
        return minCoins(coins, target-coins[i], i);
    }

    //Main function
    public static void main(String[] args) {

        //coins array and target
        int coins[]={2,4,10,20,50};
        int target=63;

        //Loop to iterate for each coin
        for(int i=coins.length-1; i>=0; i-=1)

        //recursive function to find how many times a particular coin can be used
        target=minCoins(coins, target, i);

        if(target!=0) System.out.println();
        //Displaying output
        System.out.println("Res:"+numberOfCoins);
    }
}
