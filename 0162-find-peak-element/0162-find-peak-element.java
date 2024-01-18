class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // The peak must be on the left side (including mid)
                right = mid;
            } else {
                // The peak must be on the right side (excluding mid)
                left = mid + 1;
            }
        }

        return left;
    }
}
