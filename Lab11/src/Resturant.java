import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Resturant{

	private File Menu = new File("Menu.csv");
	private MenuItem[] MenuArray;

	private File AllOrders = new File("AllOrders.txt");

	private GenericCustomer Customers;

	public ArrayList<String> Order = new ArrayList();


	public static void main(String[] args) {

		Resturant instance = new Resturant();

	}

	public Resturant() {


		readMenu();


		takeOrders();

	}

	public void readMenu() {

		try {

			FileReader fr = new FileReader(Menu);
			BufferedReader br = new BufferedReader(fr);

			String row;

			// Getting the number of columns
			row = br.readLine();
			String[] cols = row.split(",");
			int numMenuItems = Integer.parseInt(cols[0]);
			int numOfCols = Integer.parseInt(cols[1]);

			MenuArray = new MenuItem[numMenuItems];

			// Reading and printing the header:


			// this also generates the menu
			int menuElement = 0;

			while (  ( row = br.readLine() ) != null     ) {

				String[] columns = row.split(",", numOfCols);

				String ItemName = columns[0];
				int price = Integer.parseInt(columns[1]);


				MenuArray[menuElement] = new MenuItem(ItemName,price);
				menuElement++;
			}

			br.close();
			fr.close();

			printMenu();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void printMenu() {

		for (int i = 0; i < MenuArray.length; i++) {
			MenuArray[i].printMenuItem();
		}
	}
	
	public void writeOrders(String[] CustomerOrders) {



		try {

			FileWriter fw = new FileWriter("AllOrders.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < CustomerOrders.length; i++) {

				bw.write("Customer " + (i+1) +" Order: " + CustomerOrders[i] + "%\n" );
			}

			bw.close();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}



	public void takeOrders() {
		Scanner scanner;

		scanner = new Scanner(System.in);

		boolean wantToOrder;
		String Choice;
		String name;
		String[] tempMenu;
		boolean validAns;

		tempMenu = new String[MenuArray.length];
		wantToOrder = true;
		validAns = false;
		for(int i = 0; i <MenuArray.length; i++) {
		tempMenu[i] = MenuArray[i].getItemName();
		}
		
		int i = 0;
		while(wantToOrder) {


			System.out.println("Next Guest, ");


			
			System.out.println("Choose Yourself or get something Random, ");
			Choice = scanner.next();
			while(!validAns) {
				if(Choice.equals("choose") || Choice.equals("Choose")) {
					
					validAns = true;
					Customers = new InputCustomer(tempMenu);
					Customers.choosingorder(tempMenu);
					
					System.out.println("You ordered a "+Customers.getOrder());
					Order.add(Customers.getOrder());
				}
				else if(Choice.equals("random") ||Choice.equals("Random")) {
					validAns = true;
					Customers = new RandomCustomer(tempMenu);

					System.out.println("You ordered a "+Customers.getOrder());
					Order.add(Customers.getOrder());
				}
				else {
					System.out.println("Calling again.... ");
				}
			}
		}

		validAns = false;
		while(!validAns) {
			System.out.println("Anyone like to order? ");
			Choice = scanner.next();
			if(Choice.equals("yes")) {
				validAns = true;
			}
			else if(Choice.equals("no")) {
				wantToOrder = false;
			}
			else {
				System.out.println("Calling again.... ");
			}
		}


		i++;
	}





}

