//1353 : 삼각형 출력하기 1

import java.util.Scanner;

public class CU1353 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//Solution of wYuYw
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}
