import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] arr, int k) {
    PriorityQueue<BigInteger> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (String s : arr) pq.add(new BigInteger(s));
        
        while (k != 1) {
            pq.remove();
            k--;
        }
        return pq.remove()+"";
    }
}