import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Librarian {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static List<Book> books = new ArrayList<Book>();
	static List<Student> student = new ArrayList<Student>();
	static List<BookIssue> bookIssue = new ArrayList<BookIssue>();

	public void addBooks() throws NumberFormatException, IOException {
		System.out.println("Enter book id:");
		int i, flag = 0;
		int id = Integer.parseInt(bf.readLine());
		System.out.println("Enter book name:");
		String name = bf.readLine();
		if (books.isEmpty()) { 
			Book bk = new Book(id, name);
			books.add(bk);
			System.out.println("Books are successfully added");
			flag = 2;
		} else {
			for (i = 0; i < books.size(); i++) { 
				if (books.get(i).getBookId() == id) { 
					flag = 1;
				}
			}
		}
		if (flag == 1) {
			System.out.println("Book ID already registered");

		} else {
			if (flag == 0) {
				Book bk = new Book(id, name);
				books.add(bk);
				System.out.println("Books are successfully added");
			}
		}
		
		System.out.println("\n");
	}

	
	public void updateBooks() throws NumberFormatException, IOException {
		int i, flag = 0, j = 0;
		System.out.println("Enter Book id to Update:");
		int id = Integer.parseInt(bf.readLine());
		System.out.println("Enter Updated Book Name: ");
		String bookName = bf.readLine();
		for (i = 0; i < books.size(); i++) {
			if (books.get(i).getBookId() == id) {
				flag = 1;
				j = i;
				
			}
		}

		if (flag == 1) {
			books.get(j).setBookName(bookName);
			System.out.println("Books are successfully updated. To Check Please use display");
		} else {
			System.out.println("Books not found");
		}
		System.out.println("\n");

	}

	

	public void deleteBooks() throws NumberFormatException, IOException {
		int i, flag = 0, j = 0;
		System.out.println("Enter Book Id to update:");
		int id = Integer.parseInt(bf.readLine());
		for (i = 0; i < books.size(); i++) {
			if (books.get(i).getBookId() == id) {
				flag = 1;
				j = i;
			
			}
		}
		if (flag == 1) {
			books.remove(j);
			System.out.println("Book are successfully removed. Please use display to check");
		} else {
			System.out.println("Books not found");
		}
		System.out.println("\n");
	}

	

	public void addStudent() throws NumberFormatException, IOException {

		int i, flag = 0;
		System.out.println("Enter Student ID:");
		int studentId = Integer.parseInt(bf.readLine());
		System.out.println("Enter Student Name:");
		String studentName = bf.readLine();
		if (student.isEmpty()) {
			Student st = new Student(studentId, studentName);
			student.add(st);
			System.out.println("Students are Successfully added. Please use Display to check");
			flag = 2;
		} else {
			for (i = 0; i < student.size(); i++) { 
				if (student.get(i).getStudentId() == studentId) { 
					flag = 1;
					break;
				}
			}
		}
		if (flag == 1) {
			System.out.println("Student ID already Present");

		} else {
			if (flag == 0) {
				Student st = new Student(studentId, studentName);
				student.add(st);
				System.out.println("Students are Successfully added. Please use Display to check");
			}
		}
		System.out.println("\n");
	}

	

	public void addIssueBook() throws NumberFormatException, IOException {
		System.out.println("Enter Book id to issue:");

		int i, flag1 = 0, flag2 = 0;
		int bid = Integer.parseInt(bf.readLine());
		System.out.println("Enter Student id to issue:");
		int sid = Integer.parseInt(bf.readLine());

		for (i = 0; i < books.size(); i++) {
			if (books.get(i).getBookId() == bid) {
				flag1 = 1;
			}
		}

		for (i = 0; i < student.size(); i++) {
			if (student.get(i).getStudentId() == sid) {
				flag2 = 1;
			}
		}

		if (flag1 == 1 && flag2 == 1) {
			BookIssue bk = new BookIssue(bid, sid);
			bookIssue.add(bk);
			System.out.println("Books are Successfully Issued. Please use Display to check");
		} else {
			System.out.println("Book ID or Student ID not found");
		}

		
		System.out.println("\n");

	}

	
	public void displayStudent() {
		System.out.println("\n");
		System.out.println("Student List: ");
		for (Student s : student) {
			System.out.println(s);
		}
		System.out.println("\n");
	}

	
	public void displayBook() {
		System.out.println("\n");
		System.out.println("Book List: ");
		for (Book b : books) {
			System.out.println(b);
		}
		System.out.println("\n");
	}

	public void displayIssueBook() {
		System.out.println("\n");
		System.out.println("Book Issue List: ");
		for (BookIssue bi : bookIssue) {
			System.out.println(bi);
		}
		System.out.println("\n");
	}

	

	public void searchByStudentId() throws NumberFormatException, IOException {
		System.out.println("Enter Student id to search for issue:");
		int i, flag = 0;
		int id = Integer.parseInt(bf.readLine());
		for (i = 0; i < bookIssue.size(); i++) {
			if (bookIssue.get(i).getStudentId() == id) {
				System.out.println(bookIssue.get(i));
				flag = 1;
			}
		}
		if (flag == 0) {
		 	System.out.println("Student ID not found");
		} 
		

		System.out.println("\n");
	}

	
	public void searchByBookId() throws NumberFormatException, IOException {
		System.out.println("Enter Book id to search for issue:");
		int i, flag = 0;
		int id = Integer.parseInt(bf.readLine());
		for (i = 0; i < bookIssue.size(); i++) {
			if (bookIssue.get(i).getBookId() == id) {
				System.out.println(bookIssue.get(i));
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println("Book ID not found");
			
		} 
		System.out.println("\n");
	}

	
	public static void main(String args[]) throws NumberFormatException, IOException {

		int choice;
		Librarian librarian = new Librarian();
		System.out.println("WELCOME");

		while (true) {
			System.out.println("1. Enter 1 to add Student");
			System.out.println("2. Enter 2 to add Book");
			System.out.println("3. Enter 3 to update book");
			System.out.println("4. Enter 4 to delete book");
			System.out.println("5. Enter 5 to issue book");
			System.out.println("6. Enter 6 to display book");
			System.out.println("7. Enter 7 to display all issued book");
			System.out.println("8. Enter 8 to display all student");
			System.out.println("9. Enter 9 to Search Student By Id and display List Of Books Issued to Student");
			System.out.println("10. Enter 10 Search Book By Id and display List Of Student Books has Issued");
			System.out.println("11. Enter 11 to exit");
			System.out.println("Enter choice");
			choice = Integer.parseInt(bf.readLine());

			switch (choice) {
			case 1:
				librarian.addStudent();
				break;
			case 2:
				librarian.addBooks();
				break;
			case 3:
				librarian.updateBooks();
				break;
			case 4:
				librarian.deleteBooks();
				break;
			case 5:
				librarian.addIssueBook();
				break;
			case 6:
				librarian.displayBook();
				break;
			case 7:
				librarian.displayIssueBook();
				break;
			case 8:
				librarian.displayStudent();
				break;
			case 9:
				librarian.searchByStudentId();
				break;
			case 10:
				librarian.searchByBookId();
				break;
			case 11:
				System.exit(0);

			}

		}
	}

}
