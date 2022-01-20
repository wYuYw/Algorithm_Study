//1512 : 숫자 등고선

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x_start = sc.nextInt()-1;
        int y_start = sc.nextInt()-1;
        int[][] arr = new int[n][n];

        for(int x=0; x<n; x++) {
            for(int y=0; y<n; y++) {
                arr[x][y] = Math.abs(x-x_start)+Math.abs(y-y_start)+1;
            }
        }

        for(int x=0; x<n; x++) {
            for(int y=0; y<n; y++) {
                System.out.printf("%d ", arr[x][y]);
            }System.out.println();
        }

    }
}
