//1501 : 2차원 배열 채우기 1

//Solution by wYuYw

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=(n*n); i++) {
            if(i%n==0) {
                System.out.println(i);
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}
