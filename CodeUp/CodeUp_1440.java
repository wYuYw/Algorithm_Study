// 1440 : 비교

// by SonMinji_220123

import java.util.Scanner;

public class CU1440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			String str = "";
			for(int k=0; k<n; k++) {
				if(j!=k) {
					if(arr[j] == arr[k]) {
						str += "= ";
					} else {
						str += arr[j] > arr[k] ? "> " : "< ";
					}
				}
			}
			System.out.printf("%d: %s\n", j+1, str);
		}
	}
}


//Solution by wYuYw
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int k = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
    int[] numsInt = new int[k];
		
		for(int i=0; i<k; i++) {
			numsInt[i] = Integer.parseInt(nums[i]);
		}
		
		for(int i=0; i<k; i++) {
			bw.write(i+1 + ": ");
			for(int j=0; j<k; j++) {
				if(i==j) continue;
				else {
					if(numsInt[i] == numsInt[j]) {
						bw.write("= ");
					} else {
						bw.write(numsInt[i] > numsInt[j] ? "> " : "< ");
					}
				}
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
*/
