# Algorithm_Study
Sharing and studying algorithm problem solvings

화이팅 화이팅

## ~01/30(일) 학습 계획

### wYuYw

1. ~01/25(화)
// SWEA Level02 1928, 1284~

2. ~01/26(수)
// SWEA Level02 ~1285

3. ~01/27(목)
// SWEA Level02 ~1926

4. ~01/28(금)
// SWEA Level02 ~1859

5. ~01/29(토)
// CodeUp 구조체 풀이 완료

6. ~01/30(일)
// Python 알고리즘 기초 학습



### 코드 고민

1. MovieManager에서 저희가 만든 list에 값이 없을 때(해당 title의 영화가 없을 때) 예외구문을 만들어야해요.

public ArrayList searchByTitle(String title) throws MovieNotFoundException {
		ArrayList<Movie> result = new ArrayList<Movie>();
		for(int i=0; i<size; i++) {
			if(movies[i].getTitle().equals(title)) {
				result.add(movies[i]);
			}
		}
		if(result.isEmpty()) throw new MovieNotFoundException();
		else return result;
	}

				     
2. MovieTest에서 movie3를 array가 아니라 arraylist로 선언
                         
ArrayList<Movie> movie3 = new ArrayList<Movie>();

	
3. 성공!!
