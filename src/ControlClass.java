import java.util.ArrayList;
import java.util.List;

public class ControlClass {
	private List<Faculty> faculties = new ArrayList<Faculty>();
	private List<Student> students = new ArrayList<Student>();
	private List<Professor> professors = new ArrayList<Professor>();
	List<Course> courses = new ArrayList<Course>();
	
	public ControlClass() {
	}
	
	public void addFaculty(String name) {
		Faculty faculty = new Faculty(name);
		faculties.add(faculty);
	}
	
	public void addProfessor(String name, Faculty faculty) {
		if (faculties.contains(faculty)) {
			Professor prof = new Professor(name, faculty);
			professors.add(prof);
			faculty.addProfessors(prof);
		}
	}
	
	public void addCourse(String name, int max_students, Professor prof) {
		if (professors.contains(prof)) {
			Course course = new Course(name, max_students, prof);
			courses.add(course);
		}
	}
	
	public List<Faculty> getFaculties(){
		return faculties;
	}
	
	public List<Professor> getProfessors(){
		return professors;
	}
	
	public List<Course> getCourses(){
		return courses;
	}
	
}
