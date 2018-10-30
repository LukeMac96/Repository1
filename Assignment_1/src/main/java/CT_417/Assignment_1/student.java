package CT_417.Assignment_1;



public class student {   
	 
	
	private String Name;
	private int Age; 
	private String DateOfBirth;
	private long ID;
	private String Username; 		//(Concatenate name&age)
	public Module module;
	public CourseProgramme courseprogramme;
	

	
	
	//Constructor
	public student(String name, int Age, String DateOfBirth) { 	//, long ID, Module module, CourseProgramme courseprogramme
		this.Name = name;
		this.Age = Age;
		this.DateOfBirth = DateOfBirth;
		//this.ID = ID;
		//this.module = module;
		//this.courseprogramme = courseprogramme;
		//this.Username = getUsername();	
	}
	
public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public CourseProgramme getCourseprogramme() {
		return courseprogramme;
	}

	public void setCourseprogramme(CourseProgramme courseprogramme) {
		this.courseprogramme = courseprogramme;
	}

	
//Main Method for testing methods.
	
/*public static void main(String args[]) {

	student dave = new student("Dave", 22, "04/11/1996", 15463611 );
	Module CT417 = new Module("SoftwareEng", 417);
	CourseProgramme BP4 = new CourseProgramme( "ECE");
	dave.setModule(CT417);
	dave.setCourseprogramme(BP4);
	System.out.print(dave.getUsername() + "/n");
	System.out.print(dave.getCourseprogramme() +"/n" );
	System.out.print(dave.getModule()+"/n");
}*/

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	public String toString() {
		return Name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getDateOfBirth() {
		return DateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}


	public long getID() {
		return ID;
	}


	public void setID(long iD) {
		ID = iD;
	}


	public String getUsername() {
		
		String Uname = (Name + Age);
		//String Uname = (Name.concat(Integer.toString(Age)));
		Username =Uname;
		return Username;
		
	}
	
	
	
}
