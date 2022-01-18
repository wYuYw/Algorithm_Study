//1380 : 두 주사위의 합

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int i=1; i<7; i++) {
            for(int j=1; j<7; j++) {
                if((i+j)==k) System.out.printf("%d %d%n", i, j);
            }
        }
    }
}



/* 220118_손민지
import java.util.Scanner;

public class CU1380 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		
		int c = (sum<6) ? sum : 6;
		
		for(int num1 = 1; num1<=c; num1++) {
			int num2 = sum - num1;
			if(num2 != 0 && num2 <= 6) {
				System.out.printf("%d %d\n", num1, num2);
			}
		}
	}
}
*/
