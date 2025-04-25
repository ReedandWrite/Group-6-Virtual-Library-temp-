/* Project Name: Virtual Library
 * Author: Jenny Tonetti
 * Date: 4/25/2025
 * Description: This class is used to add books to the virtual library and 
 * return the availability of each book.
 */
public class Books {

	private String bookName;
	private int bookID;
	private String bookStatus;

	public Books(String bookName, int bookID, String bookStatus) { //non-default constructor
		super();
		this.bookName = bookName;
		this.bookID = bookID;
		this.bookStatus = bookStatus;
	}

	public Books() { //default constructor
		super();
		this.bookName = null;
		this.bookID = 0;
		this.bookStatus = null;
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
	protected String getBookStatus() {
		return bookStatus;
	}

	protected void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}
	public boolean isAvailable() { //checks inventory to see if a book is available to check out
		return true;
	}
}
