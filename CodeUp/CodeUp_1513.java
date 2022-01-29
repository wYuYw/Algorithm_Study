//1513 : 지그재그 배열 3

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i = n-1;
        int j = 0;

        for(int k=1; k<=((n*n+n)/2); k++) {
            arr[i][j] = k;
            if(k==((n*n+n)/2)) break;
            if((j+1)<n && arr[i-1][j+1]==0) {
                i--;
                j++;
            }
            else if((j+1)==n && arr[i+1][j-1]!=0) {
                i++;
            }
            else if((i+1)<n && arr[i+1][j-1]==0) {
                i++;
                j--;
            }
            else if((i+1)==n && arr[i-1][j+1]!=0) {
                j++;
            }
        }

        for(int p=0; p<n; p++) {
            for(int q=0; q<n; q++) {
                System.out.printf("%d ", arr[p][q]);
            } System.out.println();
        }
    }
}


// by SonMinji_220129
/*
import java.util.Scanner;

public class CU1513 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = 0;
			}
		}
		
		int value = 1;
		for(int c=1; c<=n; c++) {
			for(int i=n-1; i>=0; i--) {
				for(int j=n-1-i; j<n; j++) {
					if(c % 2 == 1 && arr[i][j] == 0) {
						arr[i][j] = value++;
						break;
					} else if(c % 2 == 0 && arr[j][i] == 0) {
						arr[j][i] = value++;
						break;
					}
				}
			}
		}

		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}
}
*/
