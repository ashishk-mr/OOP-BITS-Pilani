import static java.lang.System.out;
import static java.lang.System.in;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Test{
	public static LinkedList<Integer> list = new LinkedList<Integer>();
	
	public static void main(String[] args){
		long start = System.nanoTime();
		
		int m;
		out.println("Enter number: ");
		Scanner inp = new Scanner(in);
		m = inp.nextInt();
		list.add(m);
		while(m != 1){
			if(m%2 == 0){
				m = m/2;
				list.add(m);
			}
			
			else{
				m = 3*m+1;
				list.add(m);
			}
		}
		
		out.println("Collatz conjecture: ");
		out.println(list);
		
		long end = System.nanoTime();
		out.println("Time elapsed for main() in ms: "+(end-start)/1000000);
	}
}


class Test1{
	public static LinkedList<Integer> list = new LinkedList<Integer>();
	public static LinkedList<Integer> cases = new LinkedList<Integer>();
	
	public static void main(String[] args){
		long start = System.nanoTime();
		Scanner scan = new Scanner(in);
		int t;
		list.add(2);
		
		out.println("Enter number of test cases: ");
		t = scan.nextInt();
		for(int i=0; i<t; i++){
			out.println("Enter "+(i+1)+" test case: ");
			int case1 = scan.nextInt();
			cases.add(case1);
		}
		
		while(t>0){
			
			int num;
			for(int i=0; i<t; i++){
				long start1 = System.nanoTime();
				prime(cases.get(i));
				
				out.println(list);
				t--;
				long end1 = System.nanoTime();
				out.println();
				out.println("Elapsed time for "+(t+1)+" in seconds: "+(double)(end1-start1)/1000000000);
				out.println();
			}
		}
		
		long end = System.nanoTime();
		out.println();
		out.println("Elapsed time for main() in seconds: "+(double)(end-start)/1000000000);
	}
	
	public static void prime(int num){
		for(int i=3; i<=num; i++){
			if(list.getLast() < i && isPrime(i)){
				list.add(i);
			}
			else{
				continue;
			}
		}
	}
	
	public static boolean isPrime(int num){
		for(int i = 2; i<=num/2 ; i++){
			if(num%i ==0){
				return false;
			}
		}
		
		return true;
	}
}