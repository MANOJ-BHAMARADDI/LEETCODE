class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) {
                result[0] = i;
                for(int j=i; j<nums.length; j++){
                    if(nums[j] == target){
                        result[1] = j;
                    }
                }
                break;
            }
        }
        return result;
    }
}