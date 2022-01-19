//1425 : 자리 배치

//Solution by wYuYw

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] students = new int[n];
        for(int i=0; i<n; i++) {
            students[i] = sc.nextInt();
        }

        Arrays.sort(students);

        for(int i=0; i<n; i++) {
            System.out.print(students[i]+" ");
            if((i+1)%c==0) System.out.print("\n");
        }
    }
}
