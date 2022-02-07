// 1167 : 두 번째 수

// by SonMinji_220207

public class CU1167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int v=0; v<3; v++) {
			arr[v] = sc.nextInt();
		}
		
		int j = 3-1;
		for(int i=0; i<j; j--) {
			for(int k=i; k<j; k++) {
				if(arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		System.out.print(arr[1]);
	}
}


// solution2 by SonMinji_220207
// j변수가 없어도 돼서 조금 다르게 다시 작성
/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int v=0; v<3; v++) {
			arr[v] = sc.nextInt();
		}

		for(int i=0; i<3-1; i++) {
			for(int k=0; k<3-1-i; k++) {
				if(arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		System.out.print(arr[1]);
	}
}
*/
