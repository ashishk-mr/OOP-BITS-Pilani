
public class Item {
	
	private String itemName;
	private String itemidNo;
	private int itemQuantity;
	private double itemPrice;
	
	Item(String itemName, String itemidNo, int itemQuantity, double itemPrice){
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
	
	Item(String itemName, String itemidNo, int itemQuantity){
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = itemQuantity;
		this.itemPrice = 500.0;
	}
	
	Item(String itemName, String itemidNo){
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = 1;
		this.itemPrice = 500.0;
	}
	
	public String getitemName() {
		return this.itemName;
	}
	
	public String getitemidNo() {
		return this.itemidNo;
	}
	
	public int getitemQuantity() {
		return this.itemQuantity;
	}
	
	public double getitemPrice() {
		return this.itemPrice;
	}
	
	public void setitemName(String s) {
		this.itemName = s;
	}
	
	public void setitemidNo(String s) {
		this.itemidNo = s;
	}
	
	public void setitemQuantity(int q) {
		this.itemQuantity=q;
	}
	
	public void setitemPrice(double p) {
		this.itemPrice = p;
	}
	
}
