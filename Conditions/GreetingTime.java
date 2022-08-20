package Conditions;

public class GreetingTime {
	public static void main (String[] args) {
		int time=19;
		if(time>=6&&time<=11) {
			System.out.println("Good Mornimg");
		}
		else if(time>=12&&time<=17)
		{
			System.out.println("Good afternoon");
		}
		else if (time>=18&&time<=20)
		{
			System.out.println("Good evening");
		}
		else if(time>20&&time<=24)
		{
			System.out.println("Good Night");
		}
	}

}
