// 코드 고민

// 1. MovieManager 랑 MovieTest 에 import java.util.ArrayList; 선언

// 2. MovieManager에서 저희가 만든 list에 값이 없을 때(해당 title의 영화가 없을 때) 예외구문을 만들어야해요.

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

				     
// 3. MovieTest에서 movie3를 array가 아니라 arraylist로 선언
                         
ArrayList<Movie> movie3 = new ArrayList<Movie>();

	
// 4. 성공!!
// 출력
// title "Hello"에 해당하는 값 잘 나옴; Movie [id=1, title=Hello, director=SSAFY, genre=Action, runningTime=100]
