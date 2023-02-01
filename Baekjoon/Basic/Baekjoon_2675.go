// Baekjoon_2675 문자열 반복

// Solution by wYuYw

package main

import (
	"fmt"
)

func main() {
	var testCase int
	fmt.Scanf("%d", &testCase)
	for tc := 0; tc < testCase; tc++ {
		var n int
		var word, res string
		fmt.Scanf("%d %s", &n, &word)

		for _, char := range word {
			for i := 0; i < n; i++ {
				res += string(char)
			}
		}
		fmt.Println(res)
	}
}
