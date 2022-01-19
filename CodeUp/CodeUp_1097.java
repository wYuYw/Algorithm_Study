//1097 : [기초-2차원배열] 바둑알 십자 뒤집기(설명)

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] go = new int[19][19];
        for(int i=0; i<19; i++) {
            for(int j=0; j<19; j++) {
                go[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=0; j<19; j++) {
                if(go[x-1][j]==0) go[x-1][j] = 1;
                else go[x-1][j] = 0;
            }
            for(int j=0; j<19; j++) {
                if(go[j][y-1]==0) go[j][y-1] = 1;
                else go[j][y-1] = 0;
            }
        }
        for(int i=0; i<19; i++) {
            for(int j=0; j<19; j++) {
                System.out.printf("%d ", go[i][j]);
            } System.out.println();
        }
    }
}
