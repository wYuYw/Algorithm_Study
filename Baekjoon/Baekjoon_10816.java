// 10816. 숫자 카드 2

// by SonMinji_220607

import java.util.HashMap;
import java.util.Scanner;

public class BJ10816 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		// 가지고 있는 숫자 카드의 개수 (1 <= N <= 500,000)
		int N = sc.nextInt();
		// 가지고 있는 카드의 숫자와 해당 숫자 카드의 개수 저장할 맵
		HashMap<Integer, Integer> map = new HashMap<>();
		// 숫자 입력 받고 맵에 숫자와 카드 개수 저장하기
		for(int n=1; n<=N; n++) {
			// 숫자 카드에 적혀있는 숫자 (-10,000,000 <= 숫자 <= 10,000,000)
			int num = sc.nextInt();
			if(map.containsKey(num)) { // 이미 한 번 이상 나온 적 있는 숫자 카드인 경우
				// 해당 숫자 카드의 개수를 기존 개수+1로 변경
				map.replace(num, map.get(num)+1);
			} else { // 한 번도 나온 적 없는 숫자 카드인 경우
				// 해당 숫자와 해당 숫자 카드의 개수(1)을 map에 저장
				map.put(num, 1);
			}
		}
		
		// 몇 개 가지고 있는지 구해야 할 카드의 숫자의 개수 (1 <= M <= 500,000)
		int M = sc.nextInt();
		// 카드 개수 저장할 StringBuilder
		StringBuilder sb = new StringBuilder();
		// 숫자 입력 받고 해당 숫자 카드 몇 개 있는지 구하기
		for(int m=1; m<=M; m++) {
			// 몇 개 가지고 있는지 구해야 할 카드에 적혀있는 숫자
			int checkNum = sc.nextInt();
			if(map.get(checkNum) == null) { // 해당 숫자 카드 안가지고 있는 경우
				// 해당 숫자 카드를 갖고 있는 개수는 0이므로 null이 아니라 0으로 저장되게 하기 
				sb.append(0+" ");	
			} else { // 해당 숫자 카드 가지고 있는 경우
				// 해당 숫자 카드를 갖고 있는 개수 저장
				sb.append(map.get(checkNum)+" ");				
			}
		}
		
		// 결과 출력
		System.out.print(sb);
	}
}
