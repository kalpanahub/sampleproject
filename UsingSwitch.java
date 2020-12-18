package basicExercises;

import java.util.Scanner;

// Print color of fruit by reading fruit name from key board  Using switch
public class UsingSwitch {

	public static void main(String[] args) {

		boolean doYouWantToContinue = true;

		Scanner s1 = new Scanner(System.in);
		while(doYouWantToContinue)
		{
			System.out.print("Enter a fruit name:");

			String fruits = s1.next();


			switch(fruits){
			case "apple":
				System.out.println("The color is red");
				break;
			case "orange":
				System.out.println("The color is orange");
				break;
			case "kiwi":
				System.out.println("The color is brown");
				break;
			case "avacado":
				System.out.println("The color is green");
				break;
			case "banana":
				System.out.println("The color is yellow");
				break;
				
			default:
				System.out.println("Sorry this fruit is not in the list");

			
			}
			System.out.print("Do you want to continue true/false :");

			doYouWantToContinue = s1.nextBoolean();
			

		}
		s1.close();
	}
}


