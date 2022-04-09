// 17413. 단어 뒤집기 2

// by SonMinji_220409

import java.util.Scanner;

public class BJ17413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자열 입력
		String str = sc.nextLine();
		// 단어만 뒤집은 문자열
		StringBuilder sb = new StringBuilder();
				
		// 입력받은 문자열 확인하여 단어면 뒤집기
		loop: for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '<') { // 단어가 아니므로 그대로 저장할 부분
				for(int j=0; j<str.length()-i; j++) {
					sb.append(str.charAt(i+j));
					if(str.charAt(i+j) == '>') { // '>' 나오면 단어 아닌 부분 끝난 것
						i += j;
						break;
					}
				}
			} else { // 단어이므로 뒤집어 저장해야 되는 부분
				for(int j=0; j<str.length()-i; j++) {
					if(str.charAt(i+j) =='<' || str.charAt(i+j) == ' ') {
					// '<'나 ' '인 경우 단어가 끝난 것이므로 뒤집어서 저장해야 함
						for(int idx=i+j-1; idx>=i; idx--) {
							sb.append(str.charAt(idx));
						}
						if(str.charAt(i+j) == ' ') { 
						// ' '이 입력된 경우는 공백까지 저장함
							sb.append(str.charAt(i+j));
							i += j;
						} else { 
						// '<'인 경우는 '<'를 저장하지 않고 i도 '<'를 만나기 전까지로 설정하여
						// 제일 바깥 for문에서 i를 하나 늘려 
						// 위 if(c == '<')에 들어가서 문자를 그대로 출력해야하도록 함
							i += j-1;
						}
						break;
					} else if (i+j == str.length()-1) { 
					// 입력받은 문자열의 끝에 온 경우 단어가 끝난 것이므로 뒤집어서 저장해야 함
						for(int idx=i+j; idx>=i; idx--) {
							sb.append(str.charAt(idx));
						}
						// 문자열의 마지막 문자까지 확인했으므로 문자열 확인하는 for문 중지
						break loop;
					}
				}
			}
		}
		
		// 결과 출력
		System.out.println(sb);
	}	
}
