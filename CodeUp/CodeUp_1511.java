//1511 : 테두리의 합

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int value = 0;
        int k = 1;

        for(int p=0; p<n; p++) {
            for(int q=0; q<n; q++) {
                arr[p][q] = k++;
            }
        }

        for(int i=0; i<n; i++) value += arr[0][i];
        for(int i=1; i<n; i++) value += arr[i][n-1];
        for(int i=0; i<(n-1); i++) value += arr[n-1][i];
        for(int i=1; i<(n-1); i++) value += arr[i][0];

        System.out.println(value);
    }
}
