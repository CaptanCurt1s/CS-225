import java.util.Scanner;

public class InputCustomer extends GenericCustomer{
	
	Resturant res;
	
	public  InputCustomer(String[] Menu) {
		super(Menu);
		choosingorder(Menu);
	}
	
	@Override
	protected void choosingorder(String[] Menu){
		Scanner scanner;
		 res = new Resturant();
		scanner = new Scanner(System.in);
		
		String chosen;
		
		System.out.println("What would you like? ");
		res.printMenu();
		
		chosen = scanner.next();
		
		switch(chosen.toLowerCase()){
		case "cheeseburger":
			setOrder("Cheeseburger");
			break;
		case "hamburger":
			setOrder("Hamburger");
			break;
		case "fries":
			setOrder("Fries");
			break;
		case "drink":
			setOrder("Drink");
			break;
		case "chocolate milkshake":
			setOrder("Chocolate Milkshake");
			break;
		case "vanilla milkshake":
			setOrder("Vanilla Milkshake");
			break;
		case "chicken nuggets":
			setOrder("Chicken Nuggets");
			break;
		}

	}
	
}