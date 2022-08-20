package ElseIfLadder;

public class StudentAge {
	public static void main(String[] args) {
		int ram=30;
		int sasi=22;
		int ravi=15;
		if(ram<sasi&&ram<ravi)
		{
			System.out.println("ram is youngest");
		}
		else if(sasi<ram&&sasi<ravi)
		{
			System.out.println("sasi is youngest");
		}
		else
		{
			System.out.println("ravi is youngest");
		}
		
	}

}
