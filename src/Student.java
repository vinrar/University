import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private ID id;
	private List<Course> courses = new ArrayList<Course>();
	private Faculty faculty;
	
	public Student(String name, ID id, Faculty faculty) {
		this.name = name;
		this.id = id;
		this.faculty = faculty;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public List<Course> getCourses() {
		return courses;
	}

}
