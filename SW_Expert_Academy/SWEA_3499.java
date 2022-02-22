// 3499. 퍼펙트 셔플

// by SonMinji_220222

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class SWEA_D3_3499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tcNum=1; tcNum<=T; tcNum++) {
            int N = sc.nextInt();
            Queue<String> card1 = new LinkedList<String>();
            Queue<String> card2 = new LinkedList<>();
             
            for(int i=0; i<N; i++) {
                if(i<=(N-1)/2) {
                    card1.add(sc.next());
                } else {
                    card2.add(sc.next());
                }
            }
             
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<N/2; i++) {
                sb.append(" "+card1.remove());
                sb.append(" "+card2.remove());
            }
            if(N % 2 != 0) {
                sb.append(" "+card1.remove());
            }
                 
            String result = sb.toString();
            System.out.printf("#%d%s\n", tcNum, result);
        }
    }
}
