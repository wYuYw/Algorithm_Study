// Baekjoon_2439 별 찍기 - 2

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
		for j := 1; j <= n-i; j++ {
			starMark += " "
		}
		for j := 1; j <= i; j++ {
			starMark += "*"
		}
		fmt.Println(starMark)
	}
}
