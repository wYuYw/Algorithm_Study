// 7272. 안경이 없어!

// Solution by wYuYw

import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            String result = "SAME";
            String wordA = sc.next();
            int lengthA = wordA.length();
            int left = 0;
            String wordB = sc.next();
            int lengthB = wordB.length();
            int right = 0;
            if(lengthA != lengthB) result = "DIFF";
            else {
            	for(int i = 0; i < lengthA; i++) {
                    char wA = wordA.charAt(i);
                	if(wA == 'B') left = 2;
                    else if(wA =='A' || wA == 'D' || wA == 'P' || wA == 'O' || wA == 'Q' || wA == 'R') left = 1;
                    else left = 0;
                    char wB = wordB.charAt(i);
                	if(wB == 'B') right = 2;
                    else if(wB =='A' || wB == 'D' || wB == 'P' || wB == 'O' || wB == 'Q' || wB == 'R') right = 1;
                    else right = 0;
                    
                    if(left != right) {
                    	result = "DIFF";
                        break;
                    }
                }
            }
            System.out.println("#" + test_case + " " + result);
		}
	}
}



// by SonMinji_220305
/*
import java.util.Scanner;

public class SWEA_D3_7272 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			String str1 = sc.next();
			String str2 = sc.next();
			String[] hole = {"CEFGHIJKLMNSTUVWXYZ", "ADOPQR", "B"};

			String result = "SAME";
			if(str1.length() == str2.length()) {
				String str1Hole = "";
				String str2Hole = "";
				for(int i=0; i<str1.length(); i++) {
					for(int idx=0; idx<hole.length; idx++) {
						str1Hole = hole[idx].contains(str1.substring(i, i+1)) ? str1Hole+idx : str1Hole;
						str2Hole = hole[idx].contains(str2.substring(i, i+1)) ? str2Hole+idx : str2Hole;
					}
				}
				result = str1Hole.equals(str2Hole) ? result : "DIFF";
			} else {
				result = "DIFF";
			}
			
			System.out.printf("#%d %s\n", tcNum, result);
		}
	}
}
*/
