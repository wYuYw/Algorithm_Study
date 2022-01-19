//1403 : 배열 두번 출력하기

//Soultion by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];


        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            arr[i+n] = arr[i];
        }
        for(int i=0; i<(2*n); i++) {
            System.out.println(arr[i]);
        }
    }
}

/* by SonMinji
import java.util.Scanner;

public class CU1403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int[] arrNum = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arrNum[i] = sc.nextInt();
		}
		for(int c=1; c<=2; c++) {
			for(int i=0; i<cnt; i++) {
				System.out.println(arrNum[i]);
			}
		}
	}
}
*/
