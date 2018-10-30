package CT_417.Assignment_1;

import org.joda.time.*;
import java.util.ArrayList;
 
public class CourseProgramme { 

	private String CourseName;
	private ArrayList<Module> Modules = new ArrayList<Module>(); 
	private DateTime StartDate;
	private DateTime EndDate;
	
	
	public CourseProgramme(String Name/*, List<Module> Module, DateTime Start, DateTime End*/) {
		this.CourseName = Name;
		/*this.Modules = Module;
		this.StartDate = Start;
		this.EndDate = End;*/
	}
	
	
	 
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public DateTime getStartDate() {
		return StartDate;
	}
	public void setStartDate(DateTime startDate) {
		StartDate = startDate;
	}
	public DateTime getEndDate() {
		return EndDate;
	}
	public void setEndDate(DateTime endDate) {
		EndDate = endDate;
	}
	public ArrayList<Module> getModules() {
		return Modules;
	}
	public void AddModules(Module module) {
		Modules.add(module);
	}
	

}

