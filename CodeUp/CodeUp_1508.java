//1508 : 나도 IQ 150

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
        }

        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++){
                System.out.printf("%d ", arr[i][j]);
            } System.out.println();
        }
    }
}
