package CT_417.Assignment_1;

import java.util.ArrayList;
import java.util.List;

public class Module { 
	 
	private String ModuleName; 
	private String ModuleID; 
	private ArrayList<student> Students = new ArrayList<student>();
	private List<CourseProgramme> Courses;
	
	
	
	public Module(String Name, String ModuleId) {
		this.ModuleName = Name;
		this.ModuleID = ModuleId;
		//this.Students = Students;
		//this.Courses = Course;
	}
	
	public String toString() {
		return ModuleName;
	}
	
	
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
	public String getModuleID() {
		return ModuleID;
	}
	public void setModuleID(String moduleID) {
		ModuleID = moduleID;
	}
	public ArrayList<student> getStudents() {
		return Students;
	}
	public void AddStudents(student studente ) {
		Students.add(studente);
		//Students = students;
	}
	public List<CourseProgramme> getCourses() {
		return Courses;
	}
	public void setCourses(List<CourseProgramme> courses) {
		Courses = courses;
	}

}

