//1510 : 홀수 마방진

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i = 0;
        int j = n/2;
        int value = 0;

        for(int k=0; k<(n*n); k++) {
            arr[i][j] = ++value;
            if(value%n==0) i++;
            else {
                i--;
                j++;
            }
            if(i<=-1) i = n-1;
            if(j>=n) j = 0;
        }

        for(int p=0; p<n; p++) {
            for(int q=0; q<n; q++) {
                System.out.printf("%d ", arr[p][q]);
            } System.out.println();
        }
    }
}
