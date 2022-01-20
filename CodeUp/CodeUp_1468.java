//1468 : [기초-배열연습] 2차원 배열 지그재그 채우기 2-1

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int k = 1;
        
        for(int i=1; i<=n; i++) {
            if(i%2==1) {
                for(int j=0; j<n; j++) arr[i-1][j] = k++;
            }
            else {
                for(int j=(n-1); j>=0; j--) arr[i-1][j] = k++;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.printf("%d ", arr[i][j]);
            } System.out.println();
        }
    }
}
