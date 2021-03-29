import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class TaxOnSalary {
	private double salary;
	private boolean iPs;
	
	TaxOnSalary(){
		this.salary = 0.00;
		this.iPs = false;
	}
	
	TaxOnSalary(boolean iPs){
		this.iPs = iPs;
		this.salary = 1000.00;
	}
	
	public double calculateTax() {
		if(salary < 180000 && iPs == true)
			return 0.00;
		else if(salary < 180000 && iPs == false)
			return (0.05*salary);
		else if(salary > 180000 && salary < 500000)
			return 0.1*salary;
		else if(salary > 500000 && salary < 1000000)
			return 0.2*salary;
		else
			return 0.3*salary;
	}
	
	public void inputSalary() {
		Scanner scan = new Scanner(in);
		out.println("Enter salary:");
		salary = Double.parseDouble(scan.nextLine());
		//scan.close(); //Closing the scanner closes inputstream and thus the next element can't be recoreded.
	}
	
	public double getSalary() {
		return salary;
	}
	public boolean isiPs() {
		return iPs;
	}
	
	@Override
	public String toString() {
		return ("Salary: "+salary+"\nPan Submitted: "+iPs+"\nTax: "+this.calculateTax()+"\n");
	}
}