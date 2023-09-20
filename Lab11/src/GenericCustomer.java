

public class GenericCustomer{
	
	String Order;


	public  GenericCustomer(String[] Menu) {

		choosingorder(Menu);
	}
	
	protected void choosingorder(String[] Menu){
		
		
	}
	
	
	
	public String getOrder() {
		return Order;
	}

	public void setOrder(String order) {
		Order = order;
	}
}