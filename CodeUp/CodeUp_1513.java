//1513 : 지그재그 배열 3

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i = n-1;
        int j = 0;

        for(int k=1; k<=((n*n+n)/2); k++) {
            arr[i][j] = k;
            if(k==((n*n+n)/2)) break;
            if((j+1)<n && arr[i-1][j+1]==0) {
                i--;
                j++;
            }
            else if((j+1)==n && arr[i+1][j-1]!=0) {
                i++;
            }
            else if((i+1)<n && arr[i+1][j-1]==0) {
                i++;
                j--;
            }
            else if((i+1)==n && arr[i-1][j+1]!=0) {
                j++;
            }
        }

        for(int p=0; p<n; p++) {
            for(int q=0; q<n; q++) {
                System.out.printf("%d ", arr[p][q]);
            } System.out.println();
        }
    }
}
