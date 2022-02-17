// 1926. 간단한 369게임

// by SonMinji_220217

import java.util.Scanner;

public class SWEA_D2_1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			String str = Integer.toString(i);
			int cnt = 0;
			String plusStr = "";
			if(str.contains("3") || str.contains("6") || str.contains("9")) {
				cnt = str.length()-str.replaceAll("3", "").length();
				cnt += str.length()-str.replaceAll("6", "").length();
				cnt += str.length()-str.replaceAll("9", "").length();
				for(int c=1; c<=cnt; c++) {
					plusStr += "-";
				}
				sb.append(plusStr+" ");
			} else {
				sb.append(str+" ");
			}
		}
		String resultStr = sb.toString();
		System.out.println(resultStr);
	}
}
