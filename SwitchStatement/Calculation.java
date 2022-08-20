package SwitchStatement;

public class Calculation {
	public static void main(String[] args) {
	int num1=15;
	int num2=20;
	String operation="addition";
	switch(operation) {
	
	case "addition": System.out.println(num1+num2);break;
	case "subtract": System.out.println(num1-num2); break;
	case "multiple": System.out.println(num1*num2);break;
	case "division": System.out.println(num1/num2);break;
	case "modulus" : System.out.println(num1%num2);break;
	default: System.out.println("invalid");
	}

}
}