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
