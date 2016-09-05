package zadaci_03_09_2016;

public class Course implements Cloneable{
	
	//private data fields
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	//no-arg constructor
	public Course() {
	}
	//constructor with course name
	public Course(String courseName) {
		this.courseName = courseName;
	}
	//add students to lists 
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	//getters
	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}	
	//copy students from course to c1
	public Object clone() {
		Course c1 = null;
		try { 
			//try to clne
			c1 = (Course) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//create new array with same elements
		c1.students = this.students.clone();
		//create new String
		c1.courseName = new String(this.courseName);
		return c1;
	}

}
