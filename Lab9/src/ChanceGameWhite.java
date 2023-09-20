/*R2
 * Class:		CS225-01DB
 * Author: 		Logan White
 * Created: 	3/22/2023
 * Modified:	
 * 
 * Purpose:	
 * 
 * Methods: 	-playGame: void
 * 				+main(String[] args): static void

 * Attributes: +Players: ArrayList<Integer>
 * 			   +RollValues: Stack<Integer>
 */



import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


//R1
public class ChanceGameWhite {

	//R4
	public ArrayList<Integer> Players = new ArrayList();
	//R5
	public Stack<Integer> 	RollValues = new Stack<>();




	public static void main(String[] args) {
		ChanceGameWhite runner = new ChanceGameWhite();

		runner.playGame();
	}

	private void playGame() {

		Scanner scanner;
		int PlayerNumb;
		int size;		

		PlayerNumb = 0;


		//R3
		while (PlayerNumb < 1) {
			System.out.println("How many players? ");
			try {
				scanner = new Scanner(System.in);
				PlayerNumb = scanner.nextInt();
				if (PlayerNumb < 1 ) {
					System.out.println("You cant have a negative number of players ");

				} 
			}
			catch (Exception e) {
				System.out.println(" That is indeed not a number ");
				e.printStackTrace();
			}

		}

		System.out.println("There are " + PlayerNumb + " Players");


		//Creating it
		for(int i = 0; i < PlayerNumb; i++) {
			//R4.1
			Players.add(i, i+1);

		}


		//Printing out the initial group of players
		//R4.1
		//R10
		System.out.print("Initial Players:	" + Players + " \n" );

		//R7
		while(Players.size() != 0) {

			size = Players.size();
			//R5.1
			for(int i = 0; i <size; i++) {
				//R5.2
				RollValues.push((int) (Math.random()*6+1));

			}

			//R10
			System.out.print("\nPlayers:		" + Players + " \n" );
			System.out.print("Roll:			" + RollValues + "\n" );

			for(int i = 0; i <size; i++) {

			}

			
			//R6
			for(int i = size-1 ;i >= 0 ; i-- ) {

				System.out.print("Player " + Players.get(i));

				int roll;
				//R6.1
				roll = RollValues.pop();
				//R8
				if (roll == 2 || roll == 5) {
					System.out.print(" was successful \n");

				}
				//R9
				else {
					System.out.print(" was unsuccessful \n");
					//R9.1
					Players.remove(i);

				}


			}
			
			//R11
			System.out.print("\nSuccessful Players:	" + Players + " \n" );


		}
	}


}

