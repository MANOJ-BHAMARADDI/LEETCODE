class Solution {
    public int searchInsert(int[] nums, int target) {
        // ArrayList<Integer> numbers = new ArrayList<>(nums.length);
        // for(int i=0; i<nums.length; i++){
        //     if(target==nums[i]){
        //         return i;
        //     }else if(target!=nums[i]){
        //         numbers.add(target);
        //     }
        // }
        // Collections.sort(numbers);
        // return numbers;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i; // Return the index if target is found or if target would be inserted here.
            }
        }
        return nums.length;
    }
}