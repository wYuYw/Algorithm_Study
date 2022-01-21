//1515 : 생명 게임 1

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
        int[][] arr = new int[27][27];
        int[][] next = new int[25][25];

        for(int i=1; i<26; i++) {
            for(int j=1; j<26; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<26; i++) {
            for(int j=1; j<26; j++) {
                int count = numAround(i, j, arr);
                if(count<=1 || count>=4) next[i-1][j-1] = 0;
                else if(count==2 || count==3) {
                    if(arr[i][j]==1) next[i-1][j-1] = 1;
                    if(count==3) next[i-1][j-1] = 1;
                }
            }
        }
        
        for(int p=0; p<25; p++) {
            for(int q=0; q<25; q++) {
                System.out.printf("%d ", next[p][q]);
            } System.out.println();
        }
    }
}
