//1274 : 소수 판별

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

        if(prime(n)) System.out.println("prime");
        else System.out.println("not prime");
    }
}
