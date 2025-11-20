public class KnapsackProb {

    public static int knapsack(int[]wt, int[]val, int capacity, int item){
    if(capacity==0 || item==0) return 0;

    if(wt[item-1]<=capacity){
        int ans1= val[item-1]+knapsack(wt, val, capacity-wt[item-1], item-1);
        int ans2= knapsack(wt, val, capacity, item-1);
        int res = Math.max(ans1, ans2);
        System.out.println("Item: " + (item-1) + ", Capacity: " + capacity + ", ans1: " + ans1 + ", ans2: " + ans2 + " -> " + res);
        return res;
    } else {
        return knapsack(wt, val, capacity, item-1);
    }
}

    public static void main(String[] args) {
        int[] wt = {2,5,1,3,4};
        int[] val = {15,14,10,45,30};
        int capacity = 7;

        System.out.println(knapsack(wt, val, capacity, 5));
        
    }
}
