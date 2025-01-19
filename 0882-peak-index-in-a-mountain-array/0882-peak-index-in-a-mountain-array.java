class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int largestIndex = 0; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largestIndex]) {
                largestIndex = i; 
            }
        }

        return largestIndex;
    }
}