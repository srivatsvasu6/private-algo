class Solution {
    public int minCostClimbingStairs(int[] cost) {
          if(cost.length == 1)
              return cost[0];
        
        int[] dp = new int[cost.length+1];

        
        for(int i = 2; i<dp.length; i++){
            dp[i] =  Math.min(cost[i-1]+ dp[i-1], cost[i-2]+dp[i-2] );
        }
        
        return dp[cost.length];
        
    }
    
    
    
}