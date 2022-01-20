// 1502 : 2차원 배열 채우기 2

// by SonMinji
import java.util.Scanner;

public class CU1502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int num = i;
			for(int j=0; j<n; j++) {
				System.out.printf("%d ", num);
				num += n;
			}
			System.out.println();
		}
	}
}


//Solution by wYuYw
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int result = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                result++;
                arr[j][i] = result;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            } System.out.println();
        }
    }
}
*/
