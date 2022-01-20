//1505 : 2차원 배열 채우기 3(달팽이 배열)

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        int k = 1;
        int x = 1; int y = 0;
        for(int i=0; i<=n; i++) {
            arr[0][i] = arr[i][0] = arr[n+1][i] = arr[i][n+1] = 1;
        } //padding

        while(k<=(n*n)) {
            while(arr[x][y+1]==0) {
                y++;
                arr[x][y] = k++;
            } //Right
            while(arr[x+1][y]==0) {
                x++;
                arr[x][y] = k++;
            } //Down
            while(arr[x][y-1]==0) {
                y--;
                arr[x][y] = k++;
            } //Left
            while(arr[x-1][y]==0) {
                x--;
                arr[x][y] = k++;
            }
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++){
                System.out.printf("%d ", arr[i][j]);
            } System.out.println();
        }
    }
}
