//1509 : 진격 후 결과

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<10; i++) {
            boolean safe = true;
            if(sc.nextInt()==1) {
                for(int j=9; j>=0; j--) {
                    if(arr[j][i]<0) {
                        System.out.printf("%d %s", i+1, "fall");
                        safe = false;
                        break;
                    } else if(arr[j][i]>0) {
                        System.out.printf("%d %s", i+1, "crash");
                        safe = false;
                        break;
                    }
                }
                if(safe) System.out.printf("%d %s", i+1, "safe");
                System.out.println();
            }
        }
    }
}
