//1259 : 1부터 n까지 중 짝수의 합 구하기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=N; i++) {
            if(i%2==0) sum += i;
        }
        System.out.printf("%d ", sum);
    }
}
