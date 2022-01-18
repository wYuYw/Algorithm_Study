//1271 : 최대값 구하기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxNum = 0;

        for(int i=0; i<N; i++) {
            int num = sc.nextInt();
            maxNum = (maxNum>num) ? maxNum : num;
        }
        System.out.printf("%d", maxNum);
    }
}
