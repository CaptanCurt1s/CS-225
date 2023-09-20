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

 * Attributes: +Players:  Queue<Integer>
 * 			   +RollValues: LinkedList<Integer> 
 */




import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//R1
public class ChanceGameWhite {

	//R4
	public Queue<Integer> Players = new LinkedList<>();
	//R5
	public LinkedList<Integer> 	RollValues = new LinkedList<>();




	public static void main(String[] args) {
		ChanceGameWhite runner = new ChanceGameWhite();

		runner.playGame();
	}

	private void playGame() {

		Scanner scanner;
		int PlayerNumb;
		int size;		
		int roll;
		int random;
		int rollsize;
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
			Players.add(i);

		}


		//Printing out the initial group of players
		//R4.1
		//R10
		System.out.print("Initial Players:	" + Players + " \n" );

		//R7
		while(Players.size() != 0) {

			size = Players.size();
			System.out.println("size: " + size);
			//R5.1
			for(int i = 0; i <size; i++) {
				//R5.2
				RollValues.add((int) (Math.random()*6+1));

			}

			//R10
			System.out.print("\nPlayers:		" + Players + " \n" );
			System.out.print("Roll:			" + RollValues + "\n" );

			for(int i = 0; i <size; i++) {

			}


			//R6
			int i = 0;
			while( i < size  ) {

				

				rollsize = RollValues.size();
				random = (int) (Math.random()*rollsize);
				//R6.1
				roll = RollValues.get(random);
				RollValues.remove(random);
				//R8
				
				if (roll == 2 || roll == 5) {
					System.out.print("Player " + ((LinkedList<Integer>) Players).get(i));
					System.out.print(" was successful \n");
					i++;

				}
				//R9
				else {
					System.out.print("Player " + ((LinkedList<Integer>) Players).get(i));
					System.out.print(" was unsuccessful \n");
					//R9.1
					((LinkedList<Integer>) Players).remove(i);
					
					size = Players.size();


				}


			}
			
			//R11
			System.out.print("\nSuccessful Players:	" + Players + " \n" );
			RollValues.clear();


		}
	}


}

