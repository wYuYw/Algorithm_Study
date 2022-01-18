//1284 : 암호 해독

import java.util.Scanner;

public class Main {

	static boolean prime(int n) {
        if(n == 1)return false;
		if(n == 2)return true;
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0)return false;
		}
		return true;//소수면 true
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=0;

		for (int i = 2; i < n; i++) {
			if(prime(i)) { //i가 소수일때
				if(n % i == 0) {
					if(prime(n/i)) {
						a = i;
						b = n/i;
						break;
					}
				}else continue;
			}
		}
		if(a >= 2)System.out.println(a+" "+b);
		else System.out.println("wrong number");
    }
}
