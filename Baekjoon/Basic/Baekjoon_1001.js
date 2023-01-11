// Baekjoon_1001 A-B

// Solution by wYuYw

let fs = require('fs');
let arr = fs.readFileSync('/dev/stdin').toString().split(' ');
let a = parseInt(arr[0]);
let b = parseInt(arr[1]);
console.log(a - b);
