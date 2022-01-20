//1411 : 빠진 카드

//Solution by wYuYw

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = i+1;
        }
        int[] arr2 = new int[n-1];
        for(int i=0; i<(n-1); i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);

        for(int i=0; i<n; i++) {
            if(i==(n-1)) {
                System.out.println(arr1[i]);
                break;
            }
            if(arr1[i]!=arr2[i]) {
                System.out.println(arr1[i]);
                break;
            }
        }
    }
}
