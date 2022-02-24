// 1225. [S/W 문제해결 기본] 7일차 - 암호생성기

// Solution by wYuYw

import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int tests = 1; tests < 11; tests++){
        	// initialize
            int tc = sc.nextInt();
            int[] nums = new int[8];
            for(int i = 0; i < 8; i++) nums[i] = sc.nextInt() % 75;
            
            // get result if the process ends
            int k = 1;
            while(nums[7] > 0) {
            	if(k == 6) k = 1;
                int temp = nums[0];
            	for(int i = 1; i < 8; i++) nums[i-1] = nums[i];
                nums[7] = temp - k;
            	k += 1;
            } nums[7] = 0;
            
            // print result
            System.out.print("#" + tc + " ");
            for(int i = 0; i < 8; i++) {
            	System.out.print(nums[i] + " ");
            } System.out.println();
        }
    }
}



// Solution01 by SonMinji_220224 - 큐(Queue)
/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++) {
            int tcNum = sc.nextInt();
             
            Queue<Integer> code = new LinkedList<Integer>();
            for(int i=0; i<8; i++) {
                code.add(sc.nextInt());
            }
             
            out: while(true) {
                for(int n=1; n<=5; n++) {
                    if(code.element()-n <= 0) {
                        code.add(0);
                        code.remove();
                        break out;
                    }
                    code.add(code.remove()-n);
                }
            }
             
            StringBuilder sb = new StringBuilder();
            while(!code.isEmpty()) {
                sb.append(" "+code.remove());
            }
            String result = sb.toString();
            System.out.printf("#%d%s\n", tcNum, result);
        }
    }
}
*/


// Solution02 by SonMinji_220224 - 모듈러 연산(%) 
/*
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++) {
            int tcNum = sc.nextInt();
            int[] code = new int[8];
            for(int i=0; i<8; i++) {
                code[i] = sc.nextInt();
            }
             
            int n=0;
            int idx = -1;
            out: while(true) {
                for(int i=0; i<8; i++) {
                    ++n;
                    n = n % 5 != 0 ? n % 5 : 5;
                    if(code[i] - n <= 0) {
                        code[i] = 0;
                        idx = i;
                        break out;
                    }
                    code[i] = code[i] - n;
                }
            }
             
            StringBuilder sb = new StringBuilder();
            // 방법 1
            for(int i=idx+1; i<8; i++) {
                sb.append(" "+code[i]);
            }
            for(int i=0; i<=idx; i++) {
                sb.append(" "+code[i]);
            }
            // 방법 2
            //int fakeIdx = (idx+1)+8;
            //for(int i=idx+1; i<fakeIdx; i++) {
            //    sb.append(" "+code[i%8]);
            //}
            String result = sb.toString();
            System.out.printf("#%d%s\n", tcNum, result);
        }
    }
}
*/
