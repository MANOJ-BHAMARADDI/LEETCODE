class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;
        while(start < end){
            int currentArea = Math.min(height[start], height[end]) * (end - start);
            maxArea = Math.max(maxArea, currentArea);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}