
// Leetcode_9. Palindrome Number

// Solution01 by wYuYw - using arithmetic operation

class Solution {
  bool isPalindrome(int x) {
    // if x < 0, cannot be palindrome (eg. -121 != 121-)
    if (x < 0) {
        return false;
    }

    var original = x;
    var reversed = 0;

    while (x > 0) {
        int digit = x % 10;
        reversed = reversed * 10 + digit;
        x = x ~/ 10;
    }

    return original == reversed;
  }
}


// Solution02 by wYuYw - using type change

class Solution {
  bool isPalindrome(int x) {
    var n = x.toString();
    return n == n.split('').reversed.join();
  }
}
