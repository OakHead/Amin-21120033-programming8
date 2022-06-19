package Final;
import java.util.*;

public class BinaryToDecimal
{
	public static void main(String[] args) 
	{
		Scanner Input = new Scanner(System.in); //implement a scanner to take user input
		String binaryNumber;  //store binary number
		System.out.println("Welcome to Binary to Decimal convertion!");
		System.out.print("Please enter a binary number: ");
		
		binaryNumber = Input.nextLine(); //take input
		int binary = Integer.parseInt(binaryNumber); // change String to int
		int decimal = convertBinaryToDecimal(binary);// call function to change binary to decimal
		
		System.out.println("Your binary number is: " + binaryNumber);
		System.out.println("Your decimal number is: " + decimal);
		System.out.println("Digital format: ");
		
		String len = String.valueOf(decimal);  //convert int to String

		for(int i=0; i<len.length(); i++) // loop to see the binary number
		{
			int arr = Character.getNumericValue(len.charAt(i));
			
			disp(arr);
		}
	}
	 public static int convertBinaryToDecimal(int binary) // function to change binary to decimal
     {
       int decimalNumber = 0;
       int i = 0;
       long remainder;

       while (binary != 0) // loop to calculate the number
       {
         remainder = binary % 10;
         binary /= 10;
         decimalNumber += remainder * Math.pow(2, i);
         i++;
       }

       return decimalNumber;
     }
	static void disp(int arr) // Digital format function
    {	
    	int[][] digitalFormat = new int[][] //setup a matrix
    	{
  		  { 1, 1, 0, 1, 1, 1, 1 },
  		  { 0, 0, 0, 1, 0, 0, 1 },
  		  { 1, 0, 1, 0, 1, 1, 0 },
  		  { 1, 0, 1, 1, 0, 1, 1 },
  		  { 0, 1, 1, 1, 0, 0, 1 },
  		  { 1, 1, 1, 0, 0, 1, 1 },
  		  { 1, 1, 1, 0, 1, 1, 1 },
  		  { 1, 0, 0, 1, 0, 0, 1 },
  		  { 1, 1, 1, 1, 1, 1, 1 },
  		  { 1, 1, 1, 1, 0, 1, 1 }, 
  		};
    	for(int i =0 ; i<7; i++) // draw using the matrix
    	{
    		if(digitalFormat[arr][i] == 1)
    		{    			
    			if(i == 0) 
    			{
    				System.out.print(" _ ");
    			}
    			else if(i == 2 || i == 5)
    			{
    		     	System.out.print("_");
    			}
    		    else
    		    {
    		     	System.out.print("|");
    		    }
    		}
    		else 
    		{
    			System.out.print(" ");
    		}
    		if(i == 0 || i == 3 || i==6)
    		{
    			System.out.println();
    		}
    	}
    }
}