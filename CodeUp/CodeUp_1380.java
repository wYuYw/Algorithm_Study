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
