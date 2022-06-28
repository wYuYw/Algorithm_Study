// 2869. 달팽이는 올라가고 싶다

// by SonMinji_220628

import java.util.Scanner;

public class BJ2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1 <= B < A <= V <= 1,000,000,000
		// 올라가는 길이 (미터)
		int A = sc.nextInt();
		// 미끄러지는 길이 (미터)
		int B = sc.nextInt();
		// 나무 막대 길이 (미터)
		int V = sc.nextInt();
		
		// 나무 막대를 모두 올라가는데 걸리는 일 수
		// V-A를 A-B로 나누니까 첫 날은 빠지게 되므로 day를 1로 초기화
		int day = 1;
		// 둘째날부터 첫째날에 (A-B)만큼씩 증가하니까
		// V에 도달하는데 걸리는 일 수 알기 위해 
		if((V-A)%(A-B) != 0) { // 남은 막대 길이가 증가하는 길이로 나누어 떨이지지 않는 경우
			// 남은 막대 길이인 V-A를 A-B로 나눈 몫에 1을 더하여 day에 더해줌
			day += ((V-A)/(A-B))+1;
		} else {
			// 남은 막대 길이인 V-A를 A-B로 나눈 몫을 day에 더함
			day += (V-A)/(A-B);
		}
		
		// 결과 출력 (나무 막대를 모두 올라가는데 걸리는 일 수)
		System.out.println(day);
	}
}
