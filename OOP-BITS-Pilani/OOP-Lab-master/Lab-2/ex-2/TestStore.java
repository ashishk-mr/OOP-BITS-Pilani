import static java.lang.System.out;
import static java.lang.System.in;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TestStore {
	private static HashMap<String,Customer> map = new HashMap<String,Customer>();
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			out.println("Enter Customer Information (yes-1/no-0):");
			int ch = Integer.parseInt(br.readLine());
			
			while(ch == 1) {
				String name;
				String idNo;
				double balance;
				String itemName, itemidNo;
				double price;
				int q;
				Item i;
				
				out.println("Enter customer name, id, balance: ");
				name = br.readLine();
				idNo = br.readLine();
				balance = Double.parseDouble(br.readLine());
				
				out.println("Enter item name, id: ");
								
				itemName = br.readLine();
				itemidNo = br.readLine();
				
				int ch1, ch2;
				out.println("Enter quantity (1-yes/0-no):");
				ch1 = Integer.parseInt(br.readLine());
				out.println("Enter price (1-yes/0-no):");
				ch2 = Integer.parseInt(br.readLine());
				
				if(ch1 == 1 && ch2 == 1) {
					out.println("Enter quantity and price:");
					q = Integer.parseInt(br.readLine());
					price = Double.parseDouble(br.readLine());
					i = new Item(itemName, itemidNo, q, price);
				}
				
				else if(ch1 == 1) {
					out.println("Enter quantity:");
					q = Integer.parseInt(br.readLine());
					i = new Item(itemName, itemidNo, q);
				}
				
				else {
					i = new Item(itemName, itemidNo);
				}
								
				Customer c = new Customer(name, idNo, balance);
				c.buyItem(i);
				map.put(idNo,c);
				out.println();
				c.print();
				
				out.println("Enter more customer details (1-yes/0-no):");
				ch = Integer.parseInt(br.readLine());
			}
			
			out.println(map);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {}

	}

}