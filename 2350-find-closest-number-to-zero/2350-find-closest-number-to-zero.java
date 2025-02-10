class Solution {
    public int findClosestNumber(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int i : nums) {
            if (Math.abs(i) < Math.abs(res) || (Math.abs(i) == Math.abs(res) && i > res)) {
                res = i;
            }
        }
        return res;
    }
}