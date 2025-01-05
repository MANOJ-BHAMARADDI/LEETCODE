class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        if (matrix == null || matrix.length == 0) return false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }

        return false;

        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // int low = 0, high = rows * cols - 1;

        // while (low <= high) {
        //     int mid = (low + high) / 2;
        //     int midValue = matrix[mid / cols][mid % cols]; // Map 1D index to 2D

        //     if (midValue == target) {
        //         return true;
        //     } else if (midValue < target) {
        //         low = mid + 1;
        //     } else {
        //         high = mid - 1;
        //     }
        // }
        // return false;
    }
}