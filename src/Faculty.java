import java.util.ArrayList;
import java.util.List;

public class Faculty {
	private String name;
	private List<Professor> professors = new ArrayList<Professor>();
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	
	public Faculty(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addProfessors(Professor prof) {
		professors.add(prof);
	}
	
	public List<Professor> getProfessors() {
		return professors;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public List<Course> getCourses() {
		return courses;
	}
}
