# Baekjoon_13275 가장 긴 팰린드롬 부분 문자열

# Solution01 by wYuYw - using two pointer, pypy3

import sys
input = sys.stdin.readline

# initialize
s = input().strip()
res = 0

# validate function
def validate(left: int, right: int) -> int:
    max_length = 0
    while left >= 0 and right < len(s) and s[left] == s[right]:
        if (right - left + 1) > max_length:
            max_length = right - left + 1
        left -= 1
        right += 1
            
    return max_length

# base case
if len(s) < 2 or s == s[::-1]:
    print(len(s))

else:
    for i in range(len(s)):
        res = max(res, validate(i, i), validate(i, i + 1))
    print(res)


# Solution02 by wYuYw - using Manacher, cpython

import sys
input = sys.stdin.readline

def manacher(s):
    radius = [0 for i in range(len(s) + 1)]  # palindrome radius
    norm = 0  # index of norm character
    max_radius = 0  # maximum radius of palindrome so far
    
    for i in range(1,len(s) - 1):
        if i < max_radius:
            radius[i] = min(max_radius - i, radius[2 * norm - i])
        else:
            radius[i] = 1
        while s[i - radius[i]] == s[i + radius[i]]:
            radius[i] += 1
        if max_radius < i + radius[i]:
            norm = i
            max_radius = i + radius[i]
    norm, max_radius = 0,0
    for i in range(len(s)):
        if max_radius < radius[i]:
            norm = i
            max_radius = radius[i]
    return len(s[norm - radius[norm] + 1:norm + radius[norm]].replace('#',''))

s = input().strip()
print(manacher('$#' + '#'.join(s) + '#@'))
