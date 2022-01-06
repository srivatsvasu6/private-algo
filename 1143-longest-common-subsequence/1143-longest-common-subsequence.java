class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        
        int m = text1.length();
        int n = text2.length();
     
        
        if(m < n){
            return longestCommonSubsequence(text2, text1);
        }
        int[] dp = new int[n+1];
      
        
      
        for(int i = 1; i <= m; i++){
          int prev = 0;
            
            for(int j = 1; j<=n; j++){
           
              int tmp = dp[j];
                
               if(  text1.charAt(i-1) == text2.charAt(j-1)){
                   
                   dp[j] = 1 + prev;
                   
               } else {
                   dp[j] = Math.max(dp[j], dp[j-1]);
               }
               
                 prev = tmp;
                
            }
        }
      
        
        
    return dp[n];
        
    }
}