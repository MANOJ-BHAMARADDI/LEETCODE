class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int first = -1, second = -1; 
        int count = 0; 

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) return false; 
                
                if (first == -1) first = i;  
                else second = i;             
            }
        }

        if (count == 2) { 
            return s1.charAt(first) == s2.charAt(second) && 
                   s1.charAt(second) == s2.charAt(first);
        }
        if(count == 0){
            return true;
        }else{
            return false;
        }
    }
}