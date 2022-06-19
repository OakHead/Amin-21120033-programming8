package OOP;

public class Car 
{
	
	private String brand;
    private String model;
    private String color;
    private int price;
    private int year;
    
    public String getbrand()
    {
    	return brand;
    }
    public void setbrand(String brand) 
    {
    	this.brand = brand;
    }
    public String getmodel()
    {
    	return model;
    }
    public void setmodel(String model) 
    {
    	this.model = model;
    }
    public String getcolor()
    {
    	return color;
    }
    public void setcolor(String color) 
    {
    	this.color = color;
    }
    public int getprice()
    {
    	return price;
    }
    public void setprice(int price) 
    {
    	this.price = price;
    }
    public int getyear()
    {
    	return year;
    }
    public void setyear(int year) 
    {
    	this.year = year;
    }
    public void Start() 
    {
        System.out.println(this.brand + " " + this.model + " is starting");
    }
    public void Stop() 
    {
        System.out.println(this.brand + " " + this.model + " is stoping");
    }
    public void Park() 
    {
        System.out.println(this.brand + " " + this.model + " is parking");
    }
    public void Turn() 
    {
        System.out.println(this.brand + " " + this.model + " is turning");
    }
    public void Move() 
    {
        System.out.println(this.brand + " " + this.model + " is moving");
    }
}
