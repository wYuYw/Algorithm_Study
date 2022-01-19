//1094 : [기초-1차원배열] 이상한 출석 번호 부르기2(설명)

//Solution by wYuYw

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) stack.push(sc.nextInt());
        for (int i = 0; i < n; i++) {
            int temp = stack.pop();
            System.out.printf("%d ", temp);
        }
    }
}
