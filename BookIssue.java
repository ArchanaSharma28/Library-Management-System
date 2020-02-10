
public class BookIssue {

	private int bookId;
	private int studentId;
	
	public BookIssue() {
		super();
	}

	public BookIssue(int bookId, int studentId) {
		super();
		this.bookId = bookId;
		this.studentId = studentId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Book Id- " + bookId + ", Student Id- " + studentId;
	}
	
	
	
}
