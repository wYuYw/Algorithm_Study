//1509 : 진격 후 결과

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<10; i++) {
            boolean safe = true;
            if(sc.nextInt()==1) {
                for(int j=9; j>=0; j--) {
                    if(arr[j][i]<0) {
                        System.out.printf("%d %s", i+1, "fall");
                        safe = false;
                        break;
                    } else if(arr[j][i]>0) {
                        System.out.printf("%d %s", i+1, "crash");
                        safe = false;
                        break;
                    }
                }
                if(safe) System.out.printf("%d %s", i+1, "safe");
                System.out.println();
            }
        }
    }
}



// by SonMinji_220202
/*
import java.util.Scanner;

public class CU1509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[10][10];
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] horseArr = new int[10];
		for(int h=0; h<10; h++) {
			horseArr[h] = sc.nextInt();
		}
		
		String[] resultArr = new String[10];
		for(int c=0; c<10; c++) {
			resultArr[c] = "safe";
		}
		
		for(int c=0; c<10; c++) {
			for(int r=10-1; r>=0; r--) {
				if(arr[r][c] > 0) {
					resultArr[c] = "crash";
					break;
				} else if(arr[r][c] < 0) {
					resultArr[c] = "fall";
					break;
				}
			}
		}
		
		for(int c=0; c<10; c++) {
			if(horseArr[c] == 1) {
				System.out.printf("%d %s\n", c+1, resultArr[c]);
			}
		}

	}
}
*/
