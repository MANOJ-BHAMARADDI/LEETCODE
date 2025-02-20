class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int count = 0;
        while(start < end){
            int curSum = nums[start] + nums[end];
            if(curSum == k){
                count++;
                start++;
                end--;
            }else if(curSum < k){
                start++;
            }else{
                end--;
            }
        }
        return count;
    }
}