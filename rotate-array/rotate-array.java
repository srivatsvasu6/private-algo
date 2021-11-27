class Solution {
    public void rotate(int[] nums, int k) {
        
        int[] a = new int[nums.length];
     
        for(int j = 0; j<nums.length; j++){

        a[(j + k )% nums.length] = nums[j];
        }
         for(int j = 0; j<nums.length; j++){

        nums[j] = a[j];
        }
    }
}