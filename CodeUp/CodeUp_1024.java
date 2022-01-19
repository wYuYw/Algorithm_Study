//1024 : [기초-입출력] 단어 1개 입력받아 나누어 출력하기(설명)

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    static boolean[] arr_N = new boolean[10000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        //substring(): 문자열 자르기
        //String.substring(start) : 문자열 start위치부터 끝까지 문자열 자르기
        //String.substring(start,end) : 문자열 start위치 부터 end전까지 문자열 발췌
        for(int i=0; i<word.length(); i++) {
            String chr = word.substring(i,i+1);
            System.out.printf("'%s'%n", chr);
        }
    }
}
