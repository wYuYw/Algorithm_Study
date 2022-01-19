//1096 : [기초-2차원배열] 바둑판에 흰 돌 놓기(설명)

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] go = new int[19][19];

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            go[x-1][y-1] = 1;
        }
        for(int i=0; i<19; i++) {
            for(int j=0; j<19; j++) {
                System.out.printf("%d ", go[i][j]);
            } System.out.println();
        }
    }
}
