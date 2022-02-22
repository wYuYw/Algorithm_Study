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
