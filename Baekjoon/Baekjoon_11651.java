// 11651. 좌표 정렬하기 2

// by SonMinji_220725

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 점의 개수 (1 <= N <= 100,000)
		int N = sc.nextInt();
		// 점의 좌표 저장한 배열
		int [][] arr = new int[N][2];
		for(int n=0; n<N; n++) { // 각 점마다
			// x좌표 (-100,000 <= x <= 100,000)
			arr[n][0] = sc.nextInt();
			// y좌표 (-100,000 <= y <= 100,000)
			arr[n][1] = sc.nextInt();
		}
		
		// 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {  // y좌표가 같으면
					// x좌표 오름차순 정렬
					return o1[0] - o2[0];
				} else {
					// y좌표 오름차순 정렬
					return o1[1] - o2[1];					
				}
			}
		});
		
		// 결과 출력 (좌표 정렬 결과)
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]+" "+arr[i][1]+"\n");
		}
		System.out.println(sb);
	}
}
