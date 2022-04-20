package lab3;

public class Student 
{
	int ID;
	String Name;
	String Major;
	
	public static void main (String[] args) 
	{
		Student studentId = new Student();
		Student studentName = new Student();
		Student studentMajor = new Student();
		
		studentId.ID = 21120033;
		studentName.Name = "Amin Al-Momani";
		studentMajor.Major = "Computer Science";
				
		System.out.println(studentId.ID);
		System.out.println(studentName.Name);
		System.out.println(studentMajor.Major);
	}
}
