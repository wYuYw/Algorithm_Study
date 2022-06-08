// 17609. 회문

// by SonMinji_220608

import java.util.Scanner;

public class BJ17609 {
	public static void main(String[] args) {
		// 입력 받기 위해
		Scanner sc = new Scanner(System.in);
		// 문자열의 개수 (1 <= T <= 30)
		int T = sc.nextInt();
		// 문자열 입력받기
		for(int t=1; t<=T; t++) {
			// 문자열 (3 <= 길이 <= 100,000)
			String str = sc.next();
			// 삭제한 문자 개수
			int delCnt = 0;
			// 문자열에서 비교할 앞문자의 인덱스
			int headIdx = 0;
			// 문자열에서 비교할 뒷문자의 인덱스
			int tailIdx = str.length()-1;
			
			// 문자 비교
			// 삭제한 문자 개수가 2 이상이면 더이상 문자 비교해 볼 필요 없음
			// 앞문자의 인덱스와 뒷문자의 인덱스가 같으면 같은 문자이므로 문자 비교할 필요 없음
			// 앞문자의 인덱스가 뒷문자의 인덱스보다 커지면 문자열의 문자를 다 비교한 것이므로 문자 비교를 더 할 필요 없음
			while(delCnt < 2 && headIdx != tailIdx && headIdx < tailIdx) {
				if(str.charAt(headIdx) == str.charAt(tailIdx)) { // 문자가 같은 경우
					// 앞문자 인덱스 증가
					headIdx++;
					// 뒷문자 인덱스 감소
					tailIdx--;
				} else if(str.charAt(headIdx) == str.charAt(tailIdx-1)) { // 뒷문자 하나 지워야 문자가 같은 경우
					// 삭제한 문자 개수 증가
					delCnt++;
					// 뒷문자 하나 삭제한 것이므로 뒷문자 인덱스 감소
					tailIdx--;
				} else { // 그 외 경우
					// 삭제한 문자 개수 증가 
					delCnt++;
					// 앞문자 하나 삭제한 것이므로 앞문자 인덱스 증가
					headIdx++;
				}
			}
			
			// 결과 출력
			if(delCnt == 0) { // 삭제한 문자가 없는 경우
				// 회문이므로 0 출력
				System.out.println(0);
			} else if(delCnt == 1) { // 삭제한 문자가 한 개인 경우
				// 유사 회문이므로 1 출력
				System.out.println(1);
			} else { // 삭제한 문자가 2 개 이상인 경우
				// 앞문자 하나 지워야 문자가 같은 경우도 체크해줘야 하므로 문자 비교 한 번 더 함
				// 모든 변수 초기화
				delCnt = 0;
				headIdx = 0;
				tailIdx = str.length()-1;
				while(delCnt < 2 && headIdx != tailIdx && headIdx < tailIdx) {
					if(str.charAt(headIdx) == str.charAt(tailIdx)) {
						headIdx++;
						tailIdx--;
					} else if(str.charAt(headIdx+1) == str.charAt(tailIdx)) { // 앞문자 하나 지워야 문자가 같은 경우
						// 삭제한 문자 개수 증가
						delCnt++;
						// 앞문자 하나 삭제한 것이므로 앞문자 인덱스 증가
						headIdx++;
					} else {
						delCnt++;
						headIdx++;
					}
				}
				if(delCnt == 1) { // 삭제한 문자가 한 개인 경우
					// 유사 회문이므로 1 출력
					System.out.println(1);
				} else { // 삭제한 문자가 2 개 이상인 경우
					// 회문도 유사회문도 아니므로 2 출력
					System.out.println(2);									
				}
			}
		}//문자열 입력받는 for문
	}
}
