// 2019. 더블더블

import java.util.Scanner;

public class SWEA2019 {
	public static void main(String[] args) {
		// 1부터 주어진 횟수까지 2를 곱한 값(들)을 출력
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int a = 1;
		System.out.print(a);
		for(int i=1; i<=cnt; i++) {
			a *= 2;
			System.out.printf(" %d", a);
		}
	}
}


//Solution by wYuYw
/*
import java.util.Scanner;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
 
        for(int i = 0; i <= N; i++)
        {
            int ans = (int)Math.pow(2, i);
            System.out.printf("%d ", ans);
        }
    }
}
*/
