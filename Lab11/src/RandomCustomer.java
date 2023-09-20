


public class RandomCustomer extends GenericCustomer{
	

	
	public RandomCustomer(String[] Menu) {
		super(Menu);

		
		
	}
	
	@Override
	protected void choosingorder(String[] Menu){
		String choice;
		int random;

		random = (int) (Math.random()*Menu.length);

		choice = Menu[random];

		setOrder(choice);
		
	
		}
		
	
	
}