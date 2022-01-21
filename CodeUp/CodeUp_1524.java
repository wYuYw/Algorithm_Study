//1524 : 지뢰 찾기 1

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    static int numAround (int i, int j, int[][] arr) {
        int count = 0;
        for(int p=-1; p<=1; p++) {
            for(int q=-1; q<=1; q++) {
                if(p==0 && q==0) continue;
                else if(arr[i+p][j+q]==1) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[11][11];
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        if(arr[r][c]==1) System.out.println(-1);
        else if(arr[r][c]==0) {
            count = numAround(r, c, arr);
            System.out.println(count);
        }
    }
}
