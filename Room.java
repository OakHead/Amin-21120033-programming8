package lab3;

public class Room 
{
	int No;
	String Type;
	String Building;
	
	public static void main (String[] args) 
	{
		Room roomNo = new Room();
		Room roomType = new Room();
		Room roomBuilding = new Room();
		
		roomNo.No = 8;
		roomType.Type = "Lab";
		roomBuilding.Building = "Autom-CR";
				
		System.out.println(roomNo.No);
		System.out.println(roomType.Type);
		System.out.println(roomBuilding.Building);
	}
}
