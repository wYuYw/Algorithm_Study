// 2063. 중간값 찾기

import java.util.Arrays;
import java.util.Scanner;

public class SWEA2063 {
	public static void main(String[] args) {
    // 입력으로 N개의 점수가 주어졌을 때, 중간값을 출력
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int num;
		int[] arr = new int[count]; 
		
		for(int i=0; i<count; i++) {
			num = sc.nextInt();
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		
		int mid = count / 2;
		System.out.println(arr[mid]);
	}
}


//Solution by wYuYw
/*
import java.util.Scanner;
import java.util.Arrays;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int nums[] = new int[N];
         
        for (int i=0; i<N; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
         
        System.out.println(nums[N/2]);
    }
}
*/
