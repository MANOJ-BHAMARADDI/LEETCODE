class Solution {
    public int lengthOfLastWord(String s) {
        // int c = 0;
        // int i = s.length() - 1;
        
        // while(i>=0 && s.charAt(i) == ' '){
        //     i--;
        // }
        // while(i>=0 && s.charAt(i) != ' '){
        //     c++;
        //     i--;
        // }
        // return c;


        // OTHER APPROACH
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }
}