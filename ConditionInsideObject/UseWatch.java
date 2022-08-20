package ConditionInsideObject;

public class UseWatch {
	public static void main(String[] args ) {
		Watch watch=new Watch();
		watch.brand="fasttrack";
		watch.color="silver";
		watch.price=500;
		watch.isWarranty=false;
		watch.strap="leather";
		Watch watch1=new Watch();
		watch1.brand="sonata";
		watch1.color="white";
		watch1.price=750;
		watch1.isWarranty=false;
		watch1.strap="stainless steel";
		Watch watch2=new Watch();
		watch2.brand="rolex";
		watch2.color="black";
		watch2.price=1600;
		watch2.isWarranty=true;
		watch2.strap="leather";
		Watch watch3=new Watch();
		watch3.brand="titan";
		watch3.color="silver";
		watch3.price=1500;
		watch3.isWarranty=true;
		watch3.strap="stainless steel";
		if(watch3.price>watch2.price||watch3.price>watch1.price||watch3.price>watch.price)
		{
			System.out.println(watch3.brand.toUpperCase());
			
			
		}
		else
		{
			System.out.println(watch.brand.toUpperCase());
		}
		if(watch.brand.contains("a")||watch.brand.contains("e")||watch.brand.contains("i")||watch.brand.contains("o")||watch.brand.contains("u"))
		{
		System.out.println(watch.color);
		}
		else
		{
			System.out.println(watch.price);
		}
	}
	

}
