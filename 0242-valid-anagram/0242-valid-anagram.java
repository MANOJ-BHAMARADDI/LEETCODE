class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
    // Array to count frequency of each character (constant space: size 26)

        int[] charcount = new int[26];
        
        // Traverse both strings
        
        for(int i=0; i<s.length(); i++){
            charcount[s.charAt(i) - 'a']++;
            charcount[t.charAt(i) - 'a']--;
        }
        
        // Check if all counts are zero

        for(int count: charcount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}