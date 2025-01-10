class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];   // Start with the first element
        int ans = nums[0];   // Initialize the max subarray sum with the first element
        
        for (int i = 1; i < nums.length; i++) {  // Start from the second element
            sum = Math.max(nums[i], sum + nums[i]);  // Decide to include nums[i] or start fresh
            // ans = Math.max(ans, sum);  // Update max subarray sum if sum is larger
            if(sum > ans){
                ans = sum;
            }
        }
        
        return ans;
    }
}
