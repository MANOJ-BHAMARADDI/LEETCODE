/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let cleaned = "";

    // Manually clean the string (keep only alphanumeric, make lowercase)
    for (let i = 0; i < s.length; i++) {
        let ch = s[i];
        let lower = ch.toLowerCase();
        if (
            (lower >= 'a' && lower <= 'z') ||
            (lower >= '0' && lower <= '9')
        ) {
            cleaned += lower;
        }
    }

    // Check if cleaned string is a palindrome
    for (let i = 0, j = cleaned.length - 1; i < j; i++, j--) {
        if (cleaned[i] !== cleaned[j]) {
            return false;
        }
    }

    return true;
};
