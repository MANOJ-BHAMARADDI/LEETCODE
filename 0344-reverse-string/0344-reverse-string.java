class Solution {
    public void reverseString(char[] s) {
        // int i = 0;
        // int j = s.length - 1;

        // while (i < j) {
        //     // Swap s[i] and s[j]
        //     char temp = s[i];
        //     s[i] = s[j];
        //     s[j] = temp;

        //     // Move towards the center of the array
        //     i++;
        //     j--;
        // }
        reverseHelper(s, 0, s.length - 1);
    }
    private void reverseHelper(char[] s, int i, int j) {
        if (i >= j) return; // Base case: when indices cross or are equal stop recursion

        // Swap s[i] and s[j]
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        // Recursive call moving towards the center
        reverseHelper(s, i + 1, j - 1);
    }
}