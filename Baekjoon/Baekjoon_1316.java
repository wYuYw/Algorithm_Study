// 1316. 그룹 단어 체커

// by SonMinji_220508

import java.util.Scanner;

public class BJ1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 단어의 개수 (0 < N <= 100)
		int N = sc.nextInt();
		// 그룹 단어 개수
		int cnt = 0;
		wordLoop: for(int n=1; n<=N; n++) { // 각 단어마다
			// 입력된 단어
			String word = sc.next();
			// a(0) ~ z(25) 나온 알파벳(문자) 체크할 배열
			boolean[] alphabet = new boolean[26];
			for(int i=0; i<word.length(); i++) { // 단어(문자열)의 각 알파벳(문자)마다
				char c = word.charAt(i);
				// 해당 알파벳 체크 처리
				if(alphabet[c-'a']) { // 앞에 나왔던 알파벳이 또 나온 경우
					// 그룹 단어가 아니게 되므로 다음 단어를 체크하러 감
					continue wordLoop;
				} else { // 처음 나온 알파벳인 경우
					// 해당 알파벳에 대응하는 배열 값 true로 바꾸어 체크 처리
					alphabet[c-'a'] = true;	
				}
				// 같은 알파벳이 나온 개수 
				int same = 0;
				// 같은 알파벳이 몇 개 나오는지 (언제 다른 알파벳이 나오는지) 체크할 반복문 
				// 같은 알파벳인지 체크하기 전에 
				// 체크하려는 알파벳(문자)의 인덱스가 단어의 길이보다 작은지부터 체크 ★
				while(i+same+1 < word.length() && word.charAt(i+same+1) == c) {
					same++;
				}
				// 같은 알파벳은 한 묶음으로 생각하고 다음 알파벳부터 다시 체크되도록
				// i에 같은 알파벳 개수만큼 더해줌
				i += same;
			}//알파벳체크
			
			// 각 알파벳(문자)를 체크하는 for문을 다 돌고 여기까지 왔으면 
			// 그 단어는 그룹 단어이므로 그룹 단어 개수 하나 증가 
			cnt++;
		}//단어체크
		
		// 결과 출력
		System.out.println(cnt);
	}
}
