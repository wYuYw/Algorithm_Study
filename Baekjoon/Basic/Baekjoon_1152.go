package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	var input string
	var res int

	reader := bufio.NewReader(os.Stdin)
	input, _ = reader.ReadString('\n')
	input = strings.TrimSuffix(input, "\n")

	words := strings.Split(input, " ")
	for i := range words {
		if words[i] != "" {
			res++
		}
	}
	fmt.Println(res)
}
