// Baekjoon_1157 단어 공부

// Solution by wYuYw

package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	var input, res string
	var maxVal int

	reader := bufio.NewReader(os.Stdin)
	input, _ = reader.ReadString('\n')
	input = strings.TrimSuffix(input, "\n")
	input = strings.ToUpper(input)

	counter := make(map[string]int)
	for _, c := range input {
		// fmt.Println(reflect.TypeOf(c))
		// fmt.Println(c) -> return ASCII
		// fmt.Printf("%v", string(c))
		if string(c) != " " {
			counter[string(c)]++
		}
	}

	for character, occurrence := range counter {
		if occurrence > maxVal {
			maxVal = occurrence
			res = string(character)
		} else if occurrence == maxVal {
			res = "?"
		}
	}

	fmt.Println(res)
}

