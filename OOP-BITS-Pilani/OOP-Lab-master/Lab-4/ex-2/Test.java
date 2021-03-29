import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int op;
		Scanner scan = new Scanner(in);
		Employee m=null;
		Employee e=null;
		out.println("Create (1)manager instance, (2)Employee instance:");
		op = Integer.parseInt(scan.nextLine());
		
		switch(op) {
		case 1:
		{
			out.println("Enter name, salary, dept:");
			m = new Manager(scan.nextLine(), Double.parseDouble(scan.nextLine()), scan.nextLine());
			break;
		}
		
		case 2:
		{
			out.println("Enter name, salary:");
			e = new Employee(scan.nextLine(), Double.parseDouble(scan.nextLine()));
			break;
		}
		default:
		{
			break;
		}
		}
		
		out.println("Manager instance:" + m);
		out.println("Employee instance:" + e);
	}

}