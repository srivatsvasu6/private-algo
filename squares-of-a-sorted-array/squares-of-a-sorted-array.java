class Solution {
    public int[] sortedSquares(int[] nums) {
        
        
        int low = 0, high = nums.length -1;
        int[] res = new int[high+1];
        
      for(int i = high; i>=0; i--){
            
            int fsq = nums[low] * nums[low];
            int lsq = nums[high] * nums[high];
            int sq = 0;
            if(fsq < lsq){
               
               sq = lsq;
                  high--;
                
            }else{
                
                sq = fsq;
                  low++;
            }
          
        res[i] = sq;
            
        }
        return res;
    }
    
  
}