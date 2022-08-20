package Conditions;

public class StudentGrade {
	public static void main(String[] args) {
		int mark=80;
		if (mark>90&&mark<=100)
		{
			System.out.println("1st class");
		}
		else if(mark>80&&mark<=90)
		{
			System.out.println("2nd class ");
			
		}
		else if(mark<=80) {
			System.out.println("3rd class");
		}
	}

}
