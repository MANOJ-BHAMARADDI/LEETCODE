class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int[] result = new int[]{-1, -1};
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target) {
        //         result[0] = i;
        //         for(int j=i; j<nums.length; j++){
        //             if(nums[j] == target){
        //                 result[1] = j;
        //             }
        //         }
        //         break;
        //     }
        // }
        // return result;

        int[] result = new int[]{-1, -1};
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;


    }
    private int findFirst(int[] nums, int target){
        int i=0, j=nums.length-1;
        int first = -1;
        while(i<=j){
            int mid = i + (j - i)/2;
            if (nums[mid] == target) {
                first = mid;
                j = mid - 1;
            }else if(nums[mid] < target){
                i = mid + 1;
            }else{
                j = mid -1;
            }
        }
        return first;
    }
    private int findLast(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int last = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                last = mid;
                i = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return last;
    }
}