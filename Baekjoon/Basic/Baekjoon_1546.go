// Baekjoon_1546 평균

// Solution by wYuYw

package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var n, maxVal, sumVal int
	reader := bufio.NewReader(os.Stdin)
	fmt.Fscanln(reader, &n)

	var scores = make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Fscanf(reader, "%d ", &scores[i])
		sumVal += scores[i]
		if maxVal < scores[i] {
			maxVal = scores[i]
		}
	}

	fmt.Println((float64(sumVal) * 100) / (float64(n) * float64(maxVal)))
}
