// 1764. 듣보잡

// by SonMinji_220605

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class BJ1764 {
	public static void main(String[] args) {
		// 입력받기 위해 Scanner 사용
		Scanner sc = new Scanner(System.in);
		// 듣도 못한 사람 수 N (N <= 500,000)
		int N = sc.nextInt();
		// 보도 못한 사람 수 M (M <= 500,000)
		int M = sc.nextInt();
		
		// 듣도 못한 사람 명단
		// 시간 초과 문제가 발생하므로 ArrayList가 아니라 HashSet을 사용해야 함
		// 문제에서 명단에는 중복되는 이름이 없다고 하였음
		// HashSet의 contains()는 O(1), ArrayList의 contains()는 O(n)
		// HashSet은 map을 기반으로 구현되고, ArrayList는 indexOf()를 사용해서 contain여부를 결정
		HashSet<String> nList = new HashSet<>();
		// 입력되는 듣도 못한 사람을 HashSet에 추가
		for(int n=1; n<=N; n++) {
			nList.add(sc.next());
		}
		
		// 듣도 보도 못한 사람 리스트
		ArrayList<String> nmList = new ArrayList<>();
		// 보도 못한 사람 입력받기
		for(int m=1; m<=M; m++) {
			String mName = sc.next();
			if(nList.contains(mName)) { // 입력된 보도 못한 사람이 듣도 못한 사람 명단에 있는 경우
				// 듣도 보도 못한 사람 리스트에 추가
				nmList.add(mName);
			}
		}
		
		// 듣도 보도 못한 사람 리스트를 사전순으로 정렬
		Collections.sort(nmList);
		StringBuilder sb = new StringBuilder();
		// 듣보잡 수를 출력할 sb에 추가
		sb.append(nmList.size()+"\n");		
		for(int i=0; i<nmList.size(); i++) {
			// 듣보잡 명단을 sb에 추가 
			sb.append(nmList.get(i)+"\n");	
		}
		// 결과 출력
		System.out.print(sb);
	}
}
