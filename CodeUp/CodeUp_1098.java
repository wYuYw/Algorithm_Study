//1098 : [기초-2차원배열] 설탕과자 뽑기

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] xy = new int[h][w];
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(d==0) {
                for(int p=0; p<l; p++) xy[x-1][y-1+p] = 1;
            } else {
                for(int q=0; q<l; q++) xy[x-1+q][y-1] = 1;
            }
        }

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                System.out.printf("%d ", xy[i][j]);
            } System.out.println();
        }
    }
}
