class Solution {
    public int[] runningSum(int[] nums) {
        int prr[] = new int[nums.length];
        prr[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prr[i] = prr[i-1]+nums[i];
        }
        return prr;
    }
}