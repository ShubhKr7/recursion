package Recursion;

public class coinsEx {
    static int numberOfCoins=0;
    public static int minCoins(int []coins, int target, int i){
        if(coins[i]>target) return target;
        numberOfCoins+=1;
        return minCoins(coins, target-coins[i], i);
    }

    public static void main(String[] args) {
        int coins[]={1,2,4,10,20,50};
        int target=65;
        for(int i=coins.length-1; i>=0; i-=1){
            System.out.println("Target after coin:"+coins[i]);
        target=minCoins(coins, target, i);}
        System.out.println("Res:"+numberOfCoins);
    }
}
