// 14696. 딱지놀이

// by SonMinji_220405

import java.util.Scanner;

public class BJ14696 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 총 라운드 수 (1 <= N <= 1000)
		int N = sc.nextInt();
		for(int n=1; n<=N; n++) {
			// 딱지 정보 저장할 배열
			// 입력되는 숫자에 해당하는 인덱스의 값을 이용하여 딱지의 그림 개수를 체크
			int[][] arr = new int[2][5];
			// A가 가진 딱지에 나온 그림 개수
			int a = sc.nextInt();
      // 배열의 0행에 A의 딱지 그림 정보 입력
			for(int i=1; i<=a; i++) {
				arr[0][sc.nextInt()]++;
			}
			// B가 가진 딱지에 나온 그림 개수
			int b = sc.nextInt();
      // 배열의 1행에 B의 딱지 그림 정보 입력
			for(int i=1; i<=b; i++) {
				arr[1][sc.nextInt()]++;
			}
			
			// 승자 (무승부일 경우 D 출력이라서 D로 초기화)
			char winner = 'D';
			
			// 점수가 높은 그림부터 
			// A와 B의 딱지 중 해당 그림이 더 많은 딱지를 가진 사람이 이김
			for(int i=4; i>=1; i--) {
				if(arr[0][i] > arr[1][i]) {
					winner = 'A';
					break;
				} else if(arr[0][i] < arr[1][i]) {
					winner = 'B';
					break;
				}
			}
			
			// 결과 출력
			System.out.println(winner);
		}
	}
}
