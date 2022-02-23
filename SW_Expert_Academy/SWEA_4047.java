// 4047. 영준이의 카드 카운팅

// by SonMinji_220223

import java.util.Scanner;

public class SWEA_D3_4047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			char[] cards = sc.next().toCharArray();
			int[][] check = new int[4][14];
			boolean error = false;
			for(int i=0; i<cards.length; i++) {
				char cardType = cards[i];
				int num = (cards[++i]-'0')*10 + (cards[++i]-'0');
				
				int[] card;
				switch (cardType) {
				case 'S': card = check[0]; break;
				case 'D': card = check[1]; break;
				case 'H': card = check[2]; break;
				default: card = check[3]; break;
				}
				if(card[num] == 1) {
					error = true;
					break;
				}
				card[num]++; 
				card[0]++;
			}
			
			String result = "";
			for(int i=0; i<4; i++) {
				result += " "+(13-check[i][0]);
			}
			System.out.printf("#%d%s\n", tcNum, error ? " ERROR" : result);
		}
	}
}
