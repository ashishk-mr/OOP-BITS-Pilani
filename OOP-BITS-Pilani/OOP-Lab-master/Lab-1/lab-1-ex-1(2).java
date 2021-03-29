import static java.lang.System.out;
import static java.lang.System.in;

class Test{	
	public static void main(String[] args){
		int index = Integer.parseInt(args[0]);
		
		out.println(Fibo.fiboCalc(index));
	}
}

class Fibo{
	static int[] arr;
	static int i=2;
	static int sum = 2;
	
	public static float fiboCalc(int n){
		arr = new int[n];
		arr[0]=1;
		arr[1]=1;
		
		if(n == 1){
			display();
			return calcFiboAvg();
		}
		if(n==2){
			display();
			return calcFiboAvg();
		}
		else{
			while(i < n){
				arr[i]=arr[i-1]+arr[i-2];
				sum = sum+arr[i];
				i++;
			}
			display();
			return calcFiboAvg();
		}
	}
	
	public static float calcFiboAvg(){
		return (float)sum/(arr.length);
	}
	
	public static void display(){
		out.print("[ ");
		for(int i=0; i<arr.length; i++){
			out.print(" "+arr[i]+" ,");
		}
		out.println(" ]");
	}
}