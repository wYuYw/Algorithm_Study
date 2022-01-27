package com.ssafy.book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookManager implements IBookManager {
	
	// Singleton
	private static BookManager instance = new BookManager();
	public static BookManager getInstance() {
		return instance;
	}
	  
	private BookManager() {
		this.load();
	}
	  
	private List<Book> bookList;
	  
	@Override
	public void add(Book book) throws PreventSameException {
		bookList.add(book);
	}

	@Override
	public List<Book> getList() {
		List<Book> bList = new ArrayList<Book>(this.bookList);
		return bList;
	}

	@Override
	public List<Book> getBooks() {
		List<Book> bList = new ArrayList<Book>();
		for(int i=0; i<this.bookList.size(); i++) {
			if(!(this.bookList.get(i) instanceof SeriesBook)) {
				bList.add(this.bookList.get(i));
			}
		}
		return bList;
	}

	@Override
	public List<SeriesBook> getSeriesBooks() {
		List<SeriesBook> sbList = new ArrayList<SeriesBook>();
		for(int i=0; i<this.bookList.size(); i++) {
			if(this.bookList.get(i) instanceof SeriesBook) {
				sbList.add((SeriesBook) this.bookList.get(i));
			}
		}
		return sbList;
	}

	@Override
	public List<Book> searchByTitle(String title) throws BookNotFoundException {
		List<Book> bList = new ArrayList<Book>();
		for(Book book : this.bookList) {
			if( book.getTitle().contains(title) ) {
	        		bList.add(book);
			}
		}
		return bList;
	}

	@Override
	public List<Book> searchByPrice(int price) throws BookNotFoundException {
		List<Book> bList = new ArrayList<Book>();
	    	for(Book book : this.bookList) {
			if( book.getPrice() <= price ) {
	        		bList.add(book);
			}
		}
		return bList;
	}

	@Override
	public void removeBook(int id) throws BookNotFoundException {
		// for-each는 읽기전용(readOnly).
			
		// solution01 _ id가 같을 때의 idx가져와서 그 idx에 해당하는 데이터 지우는 방법
		// ArrayList.indexOf(~) : ~에 해당하는 인덱스 추출
		// ArrayList.get(idx) : 인덱스가 idx인 데이터 추출
		// ArrayList.remove(~) : ~에는 idx나 object 넣어서 해당하는 데이터 지우는 것
		int idx = -1;
		for(Book book : this.bookList) {
			if( book.getId() == id ) {
				idx = bookList.indexOf(book);
			}
		}
		this.bookList.remove(idx);
		//this.bookList.remove(bookList.get(idx)); 이것도 가능
			
		// solution02 _ for문에서 삭제
//		for(int i = this.bookList.size()-1; i>=0; i--) {
//		
//		}

		// solution03 _ for문에서 삭제  idx-- 
//		for(int i=0; i<this.bookList.size(); i++) {
//		
//		}
			
	}
	  
	public void save() {
		try(ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("book.dat"))) {
			ois.writeObject(this.bookList);
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  
	public void load() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"))) {
			this.bookList = (List<Book>) ois.readObject();
		} catch(Exception e) {
			this.bookList = new ArrayList<Book>();
		}
	}
	
}
