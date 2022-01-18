//1278 : 자릿수 계산

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(n!=0) {
            n /= 10;
            cnt++;
        }

        System.out.println(cnt);
    }
}



/* 220118_손민지
import java.util.Scanner;

public class CU1278 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 1;
		while(num/10 != 0) {
			count++;
			num = num/10;
		}
		System.out.println(count);
	}
}
*/
