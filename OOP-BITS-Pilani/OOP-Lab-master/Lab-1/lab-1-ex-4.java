import static java.lang.System.out;
import static java.lang.System.in;
import java.util.LinkedList;

class Test{
	static int n;
	static LinkedList<Double> term1 = new LinkedList<Double>();
	static double sum1=0;
	static LinkedList<Double> term2 = new LinkedList<Double>();
	static double sum2=0;
	
	public static void main(String[] args){
		n = Integer.parseInt(args[0]);
		
		Test1.calcHM1(); // Calculates Harmonic Mean from forward direction
		Test1.calcHM2(); // Calculates Harmonic Mean from backward direction
		
		out.println("Sum in forward: "+sum1);
		out.println("Sum in reverse: "+sum2);
		out.println("Difference b/w sum1 and sum2: "+(sum1-sum2));
	}
}

class Test1{
	public static void calcHM1(){
		double term;
		
		for(int i = 1; i<= Test.n; i++){
			term = (double)1/(double)i;
			Test.term1.add(term);
			Test.sum1 = Test.sum1+term;
		}
	}
	
	public static void calcHM2(){
		double term;
		
		for(int i = Test.n; i>=1; i--){
			term = (double)1/(double)i;
			Test.term2.add(term);
			Test.sum2 = Test.sum2+term;
		}
	}
}