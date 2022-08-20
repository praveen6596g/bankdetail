package ConditionInsideObject;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="nano";
		car1.price=100000;
		car1.color="blue";
		car1.isAutomaticGear=false;
		Car car2=new Car();
		car2.brand="Honda";
		car2.price=200000;
		car2.color="white";
		car2.isAutomaticGear=true;
		Car car3=new Car();
		car3.brand="LandRover";
		car3.price=5000000;
		car3.color="black";
		car3.isAutomaticGear=true;
		Car car4=new Car();
		car4.brand="maruthi";
		car4.price=250000;
		car4.color="silver";
		car4.isAutomaticGear=false;
		if(car3.isAutomaticGear==true)
		{
		System.out.println(car3.price+(car3.price*5/100));	
		}
		else
		{
			System.out.println(car3.price-(car3.price*8/100));
			
		}
		/*if(car1.price>car2.price)
			{
		System.out.println(car1.price+" is max");
	}
		else
		{
			System.out.println(car2.price+" is max");
		}*/
		
		

}
}