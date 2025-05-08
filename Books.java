/* Project Name: Virtual Library
 * Author: Jenny Tonetti
 * Date: 4/25/2025
 * Description: This class is used to add books to the virtual library and 
 * return the availability of each book.
 */
public class Books {

	private String bookName;
	private int bookID;
	private boolean borrowed;
	

	public Books(String bookName, int bookID, String bookStatus) { //non-default constructor
		super();
		this.bookName = bookName;
		this.bookID = bookID;
		
	}

	public Books() { //default constructor
		super();
		this.bookName = null;
		this.bookID = 0;
	
	}
	
	protected String getBookName() {
		return bookName;
	}

	protected void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	protected int getBookID() {
		return bookID;
	}

	protected void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public boolean isBorrowed() { //returns value of true if book is unavailable
		return borrowed;
	}
	public void borrowed() { //changes book status to unavailable
		borrowed = true;
	}
	public void returned() { //changes book status to available
		borrowed = false;
	}
	public void getName() {  //outputs title of book
		System.out.println(bookName);
	}
