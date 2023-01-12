// Baekjoon_1008 A/B

// Solution by wYuYw

let fs = require('fs');
let arr = fs.readFileSync('/dev/stdin').toString().split(' ');
let a = parseFloat(arr[0]);
let b = parseFloat(arr[1]);
console.log(a / b);
