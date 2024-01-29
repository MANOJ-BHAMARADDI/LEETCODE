class Solution {
    List<List<Integer>> finalAnswer = new ArrayList<List<Integer>>();
    List<Integer> currentSubset = new ArrayList<Integer>();
    
    public void recur(int[] nums, int index)
    {
        // index - denoting the element that will be chosen or not 
        if(index == nums.length)
        {
            // finalAnswer.push_back(currentSubset);
            finalAnswer.add(new ArrayList(currentSubset));
            return;
        }
        
        // two options 
        
        // 1st option - Choose the current element and continue in recursion
        currentSubset.add(nums[index]);
        recur(nums, index+1);
        
        // 2nd option - To not choose this element and continue in recursion
        int lastIndex = currentSubset.size() - 1; 
        currentSubset.remove(lastIndex);
        recur(nums, index+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        recur(nums, 0);
		
		return finalAnswer;
    }
}