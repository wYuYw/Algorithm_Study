// 2056. 연월일 달력

// by SonMinji
import java.util.Scanner;

public class SWEA2056re {
	public static void main(String[] args) {
		// 8자리 날짜 입력 받아 날짜의 유효성을 판단하여 -1 또는 YYYY/MM/DD 형식으로 출력
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int day[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i=1; i<=count; i++) {
			String num = sc.next();

			String yyyy = num.substring(0, 4);
			int mm = Integer.parseInt(num.substring(4,6));
			int dd = Integer.parseInt(num.substring(6,8));
			
			if(mm >= 1  && mm <=12 && dd >= 1 && dd <= day[mm-1] ) {
				System.out.printf("#%d %s/%02d/%02d\n", i, yyyy, mm, dd);
			} else {
				System.out.println("#"+i+" -1");
			}
		}
	}
}
