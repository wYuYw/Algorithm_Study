// Baekjoon_2438 별 찍기 - 1

// Solution by wYuYw

package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scanf("%d", &n)

	for i := 1; i <= n; i++ {
		var starMark string
		for j := 0; j < i; j++ {
			starMark += "*"
		}
		fmt.Println(starMark)
	}
}
