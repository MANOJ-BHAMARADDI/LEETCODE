class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder avivek = new StringBuilder();
        int i=0, j = 0;

        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                avivek.append(word1.charAt(i++));
            }
            if(j<word2.length()){
                avivek.append(word2.charAt(j++));
            }
        }
        return avivek.toString();
    }
}