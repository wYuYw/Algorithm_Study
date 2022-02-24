// 1873. 상호의 배틀필드

// by SonMinji_220224

import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tcNum=1; tcNum<=T; tcNum++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            char[][] map = new char[H][W];
            int startRow = -1;
            int startCol = -1;
            for(int i=0; i<H; i++) {
                String str = sc.next();
                for(int j=0; j<W; j++) {
                    map[i][j] = str.charAt(j);
                    if(map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '<' || map[i][j] == '>') {
                        startRow = i;
                        startCol = j;
                    }
                }
            }
             
            int N = sc.nextInt();
            String cmd = sc.next();
             
            int r = startRow;
            int c = startCol;
            for (int i = 0; i < N; i++) {
                switch(cmd.charAt(i)) {
                    case 'U':
                        if(r-1 >= 0 && map[r-1][c] == '.') {
                            map[r][c] = '.';
                            r--;
                        }
                        map[r][c] = '^';
                        break;
                    case 'D':
                        if(r+1 <= H-1 && map[r+1][c] == '.') {
                            map[r][c] = '.';
                            r++;
                        }
                        map[r][c]='v';
                        break;
                    case 'L':
                        if(c-1 >= 0 && map[r][c-1] == '.') {
                            map[r][c] = '.';
                            c--;
                        }
                        map[r][c]='<';
                        break;
                    case 'R':
                        if(c+1 <= W-1 && map[r][c+1] == '.') {
                            map[r][c] = '.';
                            c++;
                        }
                        map[r][c]='>';
                        break;
                    case 'S':
                        int move = 0;
                        if(map[r][c] == '^') {
                            while(r-move > 0) {
                                move++;
                                if(map[r-move][c] == '*') {
                                    map[r-move][c] = '.';
                                    break;
                                } else if(map[r-move][c] == '#') {
                                    break;
                                }
                            }
                        } else if(map[r][c] == 'v') {
                            while(r+move < H-1) {
                                move++;
                                if(map[r+move][c] == '*') {
                                    map[r+move][c] = '.';
                                    break;
                                } else if(map[r+move][c] == '#') {
                                    break;
                                }
                            }
                        } else if(map[r][c] == '<') {
                            while(c-move > 0) {
                                move++;
                                if(map[r][c-move] == '*') {
                                    map[r][c-move] = '.';
                                    break;
                                } else if(map[r][c-move] == '#') {
                                    break;
                                }
                            }
                        } else if(map[r][c] == '>') {
                            while(c+move < W-1) {
                                move++;
                                if(map[r][c+move] == '*') {
                                    map[r][c+move] = '.';
                                    break;
                                } else if(map[r][c+move] == '#') {
                                    break;
                                }
                            }
                        }
                        break;
                    }
            }
             
            System.out.print("#"+tcNum+" ");
            for(int i=0; i<H; i++) {
                for(int j=0; j<W; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }
         
    }
}
