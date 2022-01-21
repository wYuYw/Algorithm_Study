//1805 : 입체기동장치 생산공장

//Solution by wYuYw

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) {return o1[1]-o2[1];}
                else {return o1[0]-o2[0];}
            }
        });


        for(int i=0; i<n; i++) {
            for(int j=0; j<2; j++) {
                System.out.printf("%d ", arr[i][j]);
            } System.out.println();
        }
    }
}
