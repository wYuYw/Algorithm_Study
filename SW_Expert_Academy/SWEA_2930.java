// 2930. 힙

// Solution1 by SonMinji - PriorityQueue 이용

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SWEA_D3_2930 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수 입력
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) { // 각 테스트 케이스마다
			// PriorityQueue는 기본적으로 정수형에 대해서 오름차순 정렬함
			// Collections 클래스의 reverseOrder()를 사용하여 MaxHeap구조(내림차순 정렬)를 만들 수 있음
			// 출처: https://tosuccess.tistory.com/155
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			// 수행할 연산 개수 입력
			int N = sc.nextInt();
			// 최대값 출력하여 저장할 변수
			StringBuilder sb = new StringBuilder();
			for(int n=1; n<=N; n++) { // 각 연산마다
				// 연산 방법 입력
				int operation = sc.nextInt();
				if(operation == 1) { // 숫자 삽입
					pq.add(sc.nextInt());
					//System.out.println(pq); append하면 알아서 정렬해줌
				} else if(operation == 2) { // 최대값 출력 후 해당 키값 삭제
					if(pq.isEmpty()) {
						// 꺼낼 거 없으면 Stringbuilder에 공백을 두고 -1입력
						sb.append(" -1");
					} else {
						// 꺼낼 거 있으면 Stringbuilder에 공백을 두고 해당 키값 입력하면서 삭제
						// remove하면 큐의 첫번째 값을 제거하고 제거한 그 값을 반환함
						sb.append(" "+pq.remove());
					}
				}
			}
			// 결과 출력
			System.out.printf("#%d%s\n", tcNum, sb);
		}
	}
}


// Solution2 by SonMinji - ArrayList 이용

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_D3_2930re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수 입력
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) { // 각 테스트 케이스마다
			// 데이터 저장 관리할 리스트
			List<Integer> list = new ArrayList<Integer>();
			// 1번 인덱스부터 사용할 거라서 0번 인덱스에 값 임의로 넣어놓음
			list.add(0);
			// 수행할 연산 개수 입력
			int N = sc.nextInt();
			// 최대값 출력하여 저장할 변수
			StringBuilder sb = new StringBuilder();
			loop: for(int n=1; n<=N; n++) { // 각 연산마다
				// 연산 방법 입력
				int operation = sc.nextInt();
				if(operation == 1) { // 숫자 삽입
					list.add(sc.nextInt());
					// 입력된 값이 부모 값보다 클 경우 부모랑 바꾸기 
					// 현재 삽입된 값의 인덱스
					int idx = list.size()-1;
					// 내 위에 부모가 존재 && 현재 가리키는 노드의 키값이 그 노드의 부모의 키값보다 클 경우
					while(idx/2 > 0 && list.get(idx) > list.get(idx/2)) {
						// 부모와 자식 값 바꾸기
						int tmp = list.get(idx);
						list.set(idx, list.get(idx/2));
						list.set(idx/2, tmp);
						
						// 부모와 비교해야하는 자식 노드의 인덱스를 바꿔줌
						idx = idx/2;
					}
				} else if(operation == 2) { // 최대값 출력 후 해당 키값 삭제
					if(list.size()<=2) { // 꺼낼 게 없거나 노드가 하나만 있는 경우
						if(list.size() == 2) { // 루트노드의 키값 입력하면서 삭제
							sb.append(" "+list.remove(1));
						} else {
							// 꺼낼 거 없으면 -1
							sb.append(" -1");							
						}
					} else {
						// 꺼낼 거 있으면 Stringbuilder에 공백을 두고 출력
						sb.append(" "+list.get(1));
						// 루트 노드 출력하고 마지막 원소 맨 위로 올림
						// 힙은 전제조건이 완전 이진 트리이므로 삭제 시 루트 노드의 값만 삭제 가능하고  마지막 원소를 루트 노드로 올림
						list.set(1, list.remove(list.size()-1));
						// 마지막 원소가 루트노드로 올라왔으므로
						// 자식과 비교해서 최대 힙(부모의 키값 >= 자식의 키값)이 되도록 만들어줘야 함
						// 루트 노드부터 자식 노드와 값을 비교하기 위해 인덱스를 1로 초기화함
						int idx = 1;
						// 자식과 비교해서 부모에 큰 값이 오도록 바꾸기
						while(idx*2+1 <= list.size()-1) { // 자식이 둘 다(왼쪽, 오른쪽) 있는 경우
							// 자식 중 큰 값을 가지는 인덱스를 i에 저장하여 부모 값과 비교 시 사용함
							int i = idx*2+1;
							if(list.get(i-1) > list.get(i)) {
								i = i-1;
							}
							// 자식 중 큰 값과 부모 값을 비교함 
							if(list.get(idx) < list.get(i)) { 
								// 자식 값이 더 크면 부모 값과 바꿈
								int tmp = list.get(idx);
								list.set(idx, list.get(i));
								list.set(i, tmp);
								idx = i;
							} else {
								// 부모 값이 자식 값보다 더 크면 더 처리할 거 없이 다시 연산 방법 입력받으러 감
								continue loop;
							}
						}
						// 자식이 둘 다 있진 않은 경우
						// 자식이 아무도 없는 경우
						// 더이상 처리해줄 것이 없이 다시 연산 방법 입력받으러 가면 돼서 따로 처리해주지 않음
						// 자식이 하나만 있을 경우
						// 자식이 하나만 존재하고 자식 값과이 부모 값보다 더 클 경우
						// 힙은 완전 이진 트리라서 오른쪽 자식이 없는 경우는 왼쪽 자식이 마지막 원소일 때이다
						if(idx*2 == list.size()-1 && list.get(idx) < list.get(idx*2)) {
							// 부모 값이 더 커지도록 자식 값과 바꿈
							int tmp = list.get(idx);
							list.set(idx, list.get(idx*2));
							list.set(idx*2, tmp);
							// 마지막 원소를 부모와 비교한 것이므로 더 추가로 할 작업없이 다시 연산 방법 입력받으러 감
						}
					}
				}
			}
			// 결과 출력
			System.out.printf("#%d%s\n", tcNum, sb);
		}
	}
}
