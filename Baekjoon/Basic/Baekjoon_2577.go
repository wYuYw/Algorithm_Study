// Baekjoon_2577 숫자의 개수

// Solution by wYuYw

package main

import (
    "fmt"
    "strconv"
)

func main() {
    var num int
    var mulVal = 1
    var counter [10]int

    for i := 0; i < 3; i++ {
        fmt.Scanf("%d", &num)
        mulVal *= num
    }

    strVal := strconv.Itoa(mulVal)
    for _, n := range strVal {
        temp, _ := strconv.Atoi(string(n))
        counter[temp]++
    }

    for i := 0; i < 10; i++ {
        fmt.Println(counter[i])
    }
}
