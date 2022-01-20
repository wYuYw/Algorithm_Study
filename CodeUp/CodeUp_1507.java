//1507 : 4개의 직사각형 넓이

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] coord = new boolean[100][100];
        int count = 0;

        for(int i=0; i<4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int x=x1; x<x2; x++) {
                for(int y=y1; y<y2; y++) {
                    coord[x][y] = true;
                }
            }
        }

        for(int x=0; x<100; x++) {
            for(int y=0; y<100; y++) {
                if(coord[x][y]==true) count++;
            }
        }
        System.out.println(count);
    }
}



/*
// by SonMinji
import java.util.Scanner;

public class CU1507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[][] arr = new boolean[100][100];
		
		for(int i=1; i<=4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int x=x1; x<x2; x++) {
				for(int y=y1; y<y2; y++) {
					arr[x][y] = true;
				}
			}
		}
		
		int area = 0;
		for(int x=0; x<100; x++) {
			for(int y=0; y<100; y++) {
				if(arr[x][y] == true) {
					area++;
				}
			}
		}
		System.out.println(area);
	}
}
