package OOP;

public class Park 
{

	public static void main(String[] args)
	{
		Car car = new Car();
		
        car.setbrand("Maserati");
        car.setmodel("Levante");
        car.setcolor("Black");
        car.setprice(100000);
        car.setyear(2022);
        
        car.Start();
        car.Move();
        car.Turn();
        car.Move();
        car.Park();
        car.Stop();
        
        System.out.println("Here are the car's specifications:");
        System.out.println("Brand is: " + car.getbrand());
        System.out.println("Model is: " + car.getmodel());
        System.out.println("Color is: " + car.getcolor());
        System.out.println("Price is: " + car.getprice());
        System.out.println("Year of production is: " + car.getyear());
	}
}