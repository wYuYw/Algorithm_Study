//1754 : 큰 수 비교

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    static boolean[] arr_N = new boolean[10000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N1 = sc.next();
        String N2 = sc.next();

        if(N1.length()!=N2.length()) {
            String max = (N1.length()>N2.length()) ? N1 : N2;
            String min = (N1.length()>N2.length()) ? N2 : N1;
            System.out.printf("%s %s", min, max);
        }

        else {
            //compareTo(), compareToIgnoreCase(): 두 문자열을 비교 (인자.compareTo(객체))
            //0 : 두개의 문자열이 동일
            //양수 : compareTo()를 호출하는 객체가 인자보다 사전적으로 순서가 앞설 때
            //음수 : 인자가 객체보다 사전적으로 순서가 앞설 때
            if(N1.compareTo(N2)<0) System.out.printf("%s %s", N1, N2);
            else System.out.printf("%s %s", N2, N1);
        }
    }
}
