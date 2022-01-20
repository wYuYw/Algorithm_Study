//1430 : 기억력 테스트 2

//Solution01 by wYuYw; 이중 for문 - 시간초과
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr_N = new int[N];
        for(int i=0; i<N; i++) {
            arr_N[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] result = new int[M];
        int[] arr_M = new int[M];
        for(int i=0; i<M; i++) {
            arr_M[i] = sc.nextInt();
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(arr_M[i] == arr_N[j]) {
                    result[i] = 1;
                    break;
                } else result[i] = 0;
            }            
        }
        for(int i=0; i<M; i++) System.out.printf("%d ", result[i]);
    }
}

//Solution02 by wYuYw; Hashmap 사용 - 시간초과
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
    	HashMap<Integer, Integer>test = new HashMap(); //HashMap 객체 생성
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
        	test.put(sc.nextInt(), 1);
        }
        
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
        	int tmp = sc.nextInt();
        	if(test.containsKey(tmp)) //Key의 포함 여부
        		System.out.print(test.get(tmp)); //Key에 해당하는 Value 출력; 1
        	else
        		System.out.print("0");
        	System.out.print(" ");
        }
    }
}

//Solution03 by wYuYw; 전역변수 선언 후 인덱스 비교(빈도 카운팅) - 시간초과
import java.util.Scanner;

public class Main {
    static int[] arr_N = new int[10000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
             int temp = sc.nextInt();
             arr_N[temp] = temp;
        }
        int M = sc.nextInt();

        for(int i=0; i<M; i++) {
            int temp = sc.nextInt();
            if(arr_N[temp]==0) System.out.print("0 ");
            else System.out.printf("1 ");
        }
    }
}


//Solution04 by wYuYw; 전역변수 선언 후 인덱스 비교(빈도 카운팅, int가 아닌 boolean으로)
import java.util.Scanner;

public class Main {
    static boolean[] arr_N = new boolean[10000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
             int temp = sc.nextInt();
             arr_N[temp] = true;
        }
        int M = sc.nextInt();

        for(int i=0; i<M; i++) {
            int temp = sc.nextInt();
            if(arr_N[temp]==false) System.out.print("0 ");
            else System.out.print("1 ");
        }
    }
}


//Solution by Pro.Hong; 인덱스 비교(빈도 카운팅, int가 아닌 boolean으로) + StringBuilder(계속해서 읽는 것이 아니라 한번에 모아놨다가 출력)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[10000001];
        int N = sc.nextInt();
        for(int i=0; i<N; i++) arr[sc.nextInt()] = true;
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<M; i++) sb.append(arr[sc.nextInt()]?1:0).append(" ");
        System.out.println(sb);
    }
}
