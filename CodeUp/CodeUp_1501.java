//1501 : 2차원 배열 채우기 1

//Solution by wYuYw

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



/*
// by SonMinji
import java.util.Scanner;

public class CU1501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				++num;
				System.out.printf("%d ", num);
			}
			System.out.println();
		}
	}
}
*/
