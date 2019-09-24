import java.util.ArrayList;
import java.util.List;

public class Main {
	static ControlClass  control;
	

	public static void main(String[] args) {
		control = new ControlClass();
		control.addFaculty("SER");
		control.addFaculty("ERG");
		control.addFaculty("CSE");
		
		List<Faculty> faculties = new ArrayList<Faculty>();
		
		faculties = control.getFaculties();
		for (int i = 0; i < faculties.size(); i++) {
			System.out.println(faculties.get(i).getName());
		}
		
		control.addProfessor("Mehlhase", faculties.get(0));
		Professor prof1 = control.getProfessors().get(0);
		
		control.addProfessor("Gary", faculties.get(0));
		Professor prof2 = control.getProfessors().get(1);
		
		control.addProfessor("Test", faculties.get(1));
		Professor prof3 = control.getProfessors().get(2);
		
		System.out.println("All professors:");
		List<Professor> professors = control.getProfessors();
		for (int i = 0; i < professors.size(); i++) {
			System.out.println(professors.get(i).getName());
		}
		
		System.out.println("SER professors:");
		professors = faculties.get(0).getProfessors();
		for (int i = 0; i < professors.size(); i++) {
			System.out.println(professors.get(i).getName());
		}
		
		control.addCourse("SER 315", 80, prof1);
		control.addCourse("SER 315 online", 100, prof1);
		control.addCourse("SER 515", 120, prof1);
		
		control.addCourse("SER 422", 80, prof2);
		
		control.addCourse("SER 101", 80, prof3);
		
		System.out.println("All courses:");
		List<Course> courses = control.getCourses();
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).getName());
		}
		
		System.out.println("SER courses:");
		courses = control.getFaculties().get(0).getCourses();
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).getName());
		}
		
		System.out.println("CSE courses:");
		courses = control.getFaculties().get(1).getCourses();
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).getName());
		}
		
	}

}
