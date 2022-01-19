// 2071. 평균값 구하기

// by SonMinji
import java.util.Scanner;

public class SWEA2071 {
	public static void main(String[] args) {
		// 10개의 수를 입력 받아, 평균값을 출력하는 프로그램
		// 소수점 첫째 자리에서 반올림한 정수를 출력
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		for(int i=1; i<=count; i++) {
			int avg = 0;
			int sum = 0;
			for(int j=1; j<=10; j++) {
				int num = sc.nextInt();
				sum += num;
			}
			avg = (sum+5)/10;
			System.out.printf("#%d %d\n", i, avg);
		}
	}
}


//Solution by wYuYw
/*
import java.util.Scanner;
import java.lang.Math;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum = 0;
            for(int i = 0; i <= 9; i++) {
                int num = sc.nextInt();
                sum += num;
            }
            int ans = (int) Math.round(sum/10.0);
            System.out.printf("#%d %d%n", test_case, ans);
        }
    }
}
*/
