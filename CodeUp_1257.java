//1257 : 두 수 사이의 홀수 출력하기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a; i<=b; i++) {
            if(i%2!=0) System.out.printf("%d ", i);
        }
    }
}
