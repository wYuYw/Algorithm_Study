// Baekjoon_1152 단어의 개수

// Solution by wYuYw

package main

import (
	"fmt"
	"os"
  "bufio"
	"strings"
)

func main() {
	var input string
	reader := bufio.NewReader(os.Stdin)
	input, _ = reader.ReadString('\n')

	words := strings.Split(input, " ")
	var count int
	for i := range words {
		if words[i] != "\n" && words[i] != "" {
			count++
		}
	}
	fmt.Println(count)
}
