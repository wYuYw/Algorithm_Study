// Leetcode_1. Two Sum

// Solution by wYuYw

class Solution {
  List<int> twoSum(List<int> nums, int target) {
    Map<int, int> numsMap = new Map();
    for (int i = 0; i < nums.length; i++) {
        if (numsMap.containsKey(target - nums[i])) {
            return [numsMap[target - nums[i]]!, i];
        }
        numsMap[nums[i]] = i;
    }
    return [];
  }
}
