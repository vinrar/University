import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	private String name; 
	private Faculty faculty;
	private List<Course> courses = new ArrayList<Course>();
	
	public Professor(String name, Faculty faculty) {
		this.name = name; 
		this.faculty = faculty;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	
	public String getName() {
		return name;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}
	

}
