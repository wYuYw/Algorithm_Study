// Baekjoon_2562 최댓값

// Solution by wYuYw

package main

import (
	"fmt"
)

func main() {
	var num, val, idx int
	for i := 1; i <= 9; i++ {
		fmt.Scanf("%d", &num)
		if num > val {
			val = num
			idx = i
		}
	}
	fmt.Println(val)
	fmt.Println(idx)
}
