
public class MenuItem{
	
	
	private String ItemName;
	private int price;
	
	public MenuItem(String ItemName, int price) {
		
		this.ItemName = ItemName;
		this.price = price;

	}
	
	public void printMenuItem() {
		System.out.println("$" + getPrice() + " ------ " + getItemName()  );


	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int quantity) {
		this.price = quantity;
	}
	
}