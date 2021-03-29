import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class ComplexDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(in);
		out.println("Enter complex-1: ");
		
		double r= Double.parseDouble(scan.nextLine());
		double i= Double.parseDouble(scan.nextLine());
		Complex c1 = new Complex(r,i);
		
		out.println("Enter complex-2: ");
		r=Double.parseDouble(scan.nextLine());
		i=Double.parseDouble(scan.nextLine());
		
		Complex c2 = new Complex(r,i);
		
		out.println("Perform operation (y/n):");
		char ch = scan.next().trim().charAt(0);
		scan.nextLine();
		
		while(ch != 'n') {
			int op;
			out.println("(1)Add c1 and c2:\n(2)Subtract c2 from c1:\n(3)Multiply c1 and c2:\n(4)Divide c1 by c2:");
			op = Integer.parseInt(scan.nextLine());
			
			switch(op) {
			case 1:
			{
				out.println(c1.add(c2));
				break;
			}
			case 2:{
				out.println(c1.subtract(c2));
				break;
			}
			case 3:
			{
				out.println(c1.multiply(c2));
				break;
			}
			case 4:
			{
				out.println(c1.divide(c2));
				break;
			}
			default:
			{
				break;
			}
			}
			
			out.println("Perform operation(y/n):");
			ch = scan.next().trim().charAt(0);
			scan.nextLine();
		}
		
		scan.close();
	}

}