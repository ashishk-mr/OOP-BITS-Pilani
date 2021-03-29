import java.util.ArrayList;

public class TestTax {

	public static void main(String[] args) {
		ArrayList<TaxOnSalary> list = new ArrayList<TaxOnSalary>();
		
		TaxOnSalary tax1 = new TaxOnSalary(true);
		TaxOnSalary tax2 = new TaxOnSalary();
		
		list.add(tax1);
		list.add(tax2);
		tax2.inputSalary();
		tax1.inputSalary();
		
		System.out.println(list);
	}

}
