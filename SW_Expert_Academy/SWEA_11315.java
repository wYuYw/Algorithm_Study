// 11315. 오목 판정

// by SonMinji_220225

import java.util.Scanner;
 
public class SWEA_D3_11315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tcNum=1; tcNum<=T; tcNum++) {
            int N = sc.nextInt();
            char[][] map = new char[N+2][N+2];
            for(int i=1; i<=N; i++) {
                String str = sc.next();
                for(int j=1; j<=N; j++) {
                    map[i][j] = str.charAt(j-1);
                }
            }
             
            int[] dr = {1, 0, 1, 1};
            int[] dc = {0, 1, -1, 1 };
            String result = "NO";
             
            out: for(int i=1; i<=N; i++) {
                for(int j=1; j<=N; j++) {
                     
                    if(map[i][j] == 'o') {
                        for(int d=0; d<4; d++) {
                            int cnt = 1;
                            int mi = i;
                            int mj = j;
                            while(map[mi+dr[d]][mj+dc[d]] == 'o') {
                                cnt++;
                                mi = mi+dr[d];
                                mj = mj+dc[d];
                                if(cnt == 5) {
                                    result = "YES";
                                    break out;
                                }
                            }
                        }
                    }
                     
                }
            }
             
            System.out.printf("#%d %s\n", tcNum, result);
        }
    }
}
