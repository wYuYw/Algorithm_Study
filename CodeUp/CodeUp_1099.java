//1099 : [기초-2차원배열] 성실한 개미

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for(int x=0; x<10; x++) {
            for(int y=0; y<10; y++) {
                arr[x][y] = sc.nextInt();
            }
        }

        //start point: (x,y) = (1,1)
        int x = 1; int y = 1;
        while(true) {
            if(arr[x][y]==0) arr[x][y] = 9;
            else if(arr[x][y]==2) {
                arr[x][y] = 9;
                break;
            }
            //전체 arr를 벗어날 경우를 제외해야함!!
            if((x == 9 && y == 9) || (arr[x][y + 1] == 1 && arr[x + 1][y] == 1)) break;
            if(arr[x][y+1] != 1) y += 1;
            else if(arr[x+1][y] != 1) x += 1;
        }

        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                System.out.printf("%d ", arr[i][j]);
            } System.out.println();
        }
    }
}
