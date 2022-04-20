package lab3;

public class Mobile 
{
	String Brand;
	String Color;
	String Camera;
	int yearOfProduction;
	
	public static void main (String[] args) 
	{
		Mobile mobileBrand = new Mobile();
		Mobile mobileColor = new Mobile();
		Mobile mobileCamera = new Mobile();
		Mobile mobileYearOfProduction = new Mobile();
		
		mobileBrand.Brand = "Samsung";
		mobileColor.Color = "Black";
		mobileCamera.Camera = "2 Cams records @4k 60 FPS";
		mobileYearOfProduction.yearOfProduction = 2017;
				
		System.out.println(mobileBrand.Brand);
		System.out.println(mobileColor.Color);
		System.out.println(mobileCamera.Camera);
		System.out.println(mobileYearOfProduction.yearOfProduction);
	}
}
