// 1282 : 제곱수 만들기

// by SonMinji

import java.util.Scanner;

public class CU1282 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제에서 (0<k<n<=2^31)라고 주어졌으니까 int n이 아니라 long n
		// k는 n보다 작다고 했으니 int여도 괜찮지만 long(n에 해당)-int(i*i에 해당)가 long타입이라 long k로 바꿔줘야 함
		// int는 4바이트니까 4*8 = 32 -1(부호비트) 해서 2^31 - 1 까지 넣을 수 있다
		long n = sc.nextInt();
		
		for(int i=1; ; i++) {
			if(n<=(i+1)*(i+1) && n>=i*i) {
				long k = n - i*i;
				System.out.println(k+" "+i);
				break;
			}
		}
	}	
}
