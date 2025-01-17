class Solution {
    public void swap(int[] nums, int p1, int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int start =0;
        for(int i=0;i <nums.length ;i++){
            if(nums[i]%2 ==0){
                swap(nums,i,start);
                start++;
            }
        }
        return nums;
    }
}