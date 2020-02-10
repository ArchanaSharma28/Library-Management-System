
public class Student {

	private int studentId;
	private String studentname;
	
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentname) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentname;
	}

	public void setName(String studentname) {
		this.studentname = studentname;
	}

	@Override
	public String toString() {
		return "Student Id- " + studentId + ", Student Name- " + studentname;
	}
	
	
	
	
}
