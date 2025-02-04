class Solution {
    public int maxAscendingSum(int[] nums) {
        int currentelement = nums[0], maxsubarraysum = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                currentelement += nums[i];
            }else{
                currentelement = nums[i];
            }

            if(currentelement > maxsubarraysum){
                maxsubarraysum = currentelement;
            }
        }
        return maxsubarraysum;
    }
}