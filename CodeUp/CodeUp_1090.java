//1090 : [기초-종합] 수 나열하기2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long r = sc.nextInt();
        long n = sc.nextInt();

		for (int i=1; i<n; i++) {
            a *= r;
		}
        System.out.println(a);
    }
}
