package lab3;

public class Car 
{
	String Type;
	String Model;
	String Color;
	
	public static void main (String[] args)
	{
		Car carType = new Car();
		Car carModel = new Car();
		Car carColor = new Car();
		
		carType.Type = "Maserati";
		carModel.Model = "Quattroporte";
		carColor.Color = "Black";
		
		System.out.println(carType.Type);
		System.out.println(carModel.Model);
		System.out.println(carColor.Color);
	}
}
