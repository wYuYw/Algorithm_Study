//1355 : 삼각형 출력하기 3
//"너무 멋있는 코드!" by wYuYw

import java.util.Scanner;

public class CU1355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			for(int j=n; j>=1; j--) {
				String str = (i<j) ? " " : "*";
				System.out.print(str);
			}
			System.out.println();
		}
	}
}


//Solution by wYuYw
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++) {
            if(i!=0) {
                for(int k=0; k<i; k++) {
                    System.out.print(" ");
                }
            }
            for(int j=0; j<(n-i); j++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}
*/


//Solution by Pro.Hong
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int j=n; j>=1; j--) {
            for(int i=0; i<(n-j); i++) System.out.print(" ");
            for(int i=0; i<j; i++) System.out.print("*");
            System.out.println();
        }
    }
}
*/
