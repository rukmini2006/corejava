package rukmini.tut.classes;

public class Student {
	private String name;
	private int rollNumber;
	int height;
	int grade;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber
				+ ", height=" + height + ", grade=" + grade + "]";
	}
	public String getName(){
		return name;
		
	}
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public Student(String assignedName, int assignRollNumber, int assignGrade) {
		/*name = assignedName;
		rollNumber = assignRollNumber;*/
		this(assignedName,assignRollNumber);
		grade = assignGrade;
	}
	
	public Student(String assignedName, int assignRollNumber, int assignGrade, int assignedHeight) {
		this(assignedName,assignRollNumber, assignGrade);
		height = assignedHeight;
	}
	
	public Student(int assignRollNumber, String assignedName , int assignGrade) {
		name = assignedName;
		rollNumber = assignRollNumber;
		grade = assignGrade;
	}
	public void printStudentInfo(){
		System.out.println( getInfo());
	}
	
	public void printStudentInfo(String message){
		System.out.println(message +" " + getInfo());
	}
	
	private  String getInfo() {
		return this.name +" "+this.rollNumber + " "+grade +" "+height;
		
	}
}