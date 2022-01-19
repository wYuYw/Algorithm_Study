//1990 : 3의 배수 판별하기

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    static boolean[] arr_N = new boolean[10000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = word.length();
        int[] arr = new int[n];
        int result = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(word.substring(i,i+1));
        for(int i=0; i<n; i++) {
            result += arr[i];
        }
        if(result%3==0) System.out.println(1);
        else System.out.println(0);
    }
}
