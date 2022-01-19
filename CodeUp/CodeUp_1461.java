//1461 : [기초-배열연습] 2차원 배열 순서대로 채우기 1-2

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0; j<n*n; j+=n) {
            for(int i=(n+j); i>=(1+j); i--) {
                if(i%n==1) {
                    System.out.printf("%d ", i);
                    System.out.println();
                }
                else System.out.printf("%d ", i);
            }
        }
    }
}
