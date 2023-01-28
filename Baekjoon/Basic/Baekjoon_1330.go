// Baekjoon_1330 두 수 비교하기

// Solution by wYuYw

package main

import (
	"fmt"
)

func main() {
	var a, b int
	fmt.Scanf("%d %d", &a, &b)

	if a == b {
		fmt.Println("==")
	} else if a > b {
		fmt.Println(">")
	} else {
		fmt.Println("<")
	}
}
