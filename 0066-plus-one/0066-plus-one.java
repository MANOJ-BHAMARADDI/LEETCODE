import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder number = new StringBuilder();
        for (int digit : digits) {
            number.append(digit);
        }

        // Convert the string to a BigInteger and add 1
        BigInteger bigNumber = new BigInteger(number.toString());
        bigNumber = bigNumber.add(BigInteger.ONE);

        // Convert the result BigInteger to a string
        String resultString = bigNumber.toString();

        // Convert the string to array of digits
        int[] result = new int[resultString.length()];
        for (int i = 0; i < resultString.length(); i++) {
            result[i] = resultString.charAt(i) - '0';
        }

        return result;
    }
}