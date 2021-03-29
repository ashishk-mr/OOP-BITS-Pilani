import static java.lang.System.out;
import static java.lang.System.in;

public class Customer {
	
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	
	Customer(String name, String idNo, double balance){
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
	}
	
	
	Customer(String name, String idNo){
		this.name = name;
		this.idNo = idNo;
		this.balance = 5000.0;
	}
	
	
	public String getname() {
		return this.name;
	}
	
	
	public String getidNo() {
		return this.idNo;
	}
	
	
	public double getbalance() {
		return this.balance;
	}
	
	
	public Item getitem() {
		return this.item;
	}
	
	
	public void setname(String s) {
		this.name = s;
	}
	
	
	public void setidNo(String s) {
		this.idNo = s;
	}
	
	
	public void print() {
		out.println("Item name: "+this.item.getitemName());
		out.println("Item id No.: "+this.item.getitemidNo());
		out.println("Item quantity: "+this.item.getitemQuantity());
		out.println("Item price: "+this.item.getitemPrice());
		
		out.println("\nBalance of customer: "+this.getbalance());
	}
	
	
	public void buyItem(Item item) {
		
		if(item.getitemQuantity() < 1) {
			out.println("Order is not valid");
		}
		
		double cost = item.getitemQuantity() * item.getitemPrice();
		
		if(cost > this.balance) {
			out.println("Insufficient balance");
		}
		
		else {
			this.item = item;
			this.balance = this.balance - cost;
			out.println("Item bought: "+item.getitemName());
			out.println("Item cost: "+cost);
			out.println("Remaining balance: "+this.getbalance());
		}
	}
	
	@Override
	public String toString() {
		return ("\tName: "+this.getname()+"\tId No.:"+this.getidNo()+"\tBalance: "+this.getbalance());
	}
}
