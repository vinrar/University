
public class Course {
	private String name;
	private int max_students;
	private Professor professor;
	private Student[] students;
	
	public Course(String name, int max_students, Professor prof) {
		this.name = name;
		this.max_students = max_students;
		this.professor = prof;
		prof.addCourse(this);
		prof.getFaculty().addCourse(this);
	}
	
	public String getName() {
		return name;
	}
	
	public int getMax() {
		return max_students;
	}
	
	public int getStudentsNumber() {
		return students.length;
	}
	
	public Professor getProf() {
		return professor;
	}

}
