//1520 : 생명 게임 2

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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[][] arr = new int[a+2][b+2];
        int[][] next = new int[a][b];


        for(int i=1; i<a+1; i++) {
            for(int j=1; j<b+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();

        //생명이 태어나기 위한 이웃의 수 x, 생명이 살기 위해 필요한 최소 이웃 수 y, 생명이 죽는 최소 이웃수 z
        for(int l=0; l<k; l++) {
            for(int i=1; i<a+1; i++) {
                for(int j=1; j<b+1; j++) {
                    int count = numAround(i, j, arr);
                    if (arr[i][j] == 0) {
                        if (count == x) next[i-1][j-1] = 1;
                        else next[i-1][j-1] = 0;
                    }
                    else if (arr[i][j] == 1) {
                        if (y <= count && count < z) next[i-1][j-1] = 1;
                        else next[i-1][j-1] = 0;
                    }
                }
            }
            for(int p=1; p<a+1; p++) {
                for(int q=1; q<b+1; q++) {
                    arr[p][q] = next[p-1][q-1];
                }
            }
        }
        
        for(int p=0; p<a; p++) {
            for(int q=0; q<b; q++) {
                System.out.printf("%d ", next[p][q]);
            } System.out.println();
        }
    }
}
