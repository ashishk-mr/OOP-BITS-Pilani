import static java.lang.System.out;
import static java.lang.System.in;
import java.util.LinkedList;
import java.util.Scanner;

class Test{
	static int[] arr,arr1;
	static LinkedList<Pair> pairs = new LinkedList<Pair>();
	
	public static void main(String[] args){
		arr = new int[args.length];
		arr1 = new int[arr.length];
		Scanner inp = new Scanner(in);
		
		for(int i=0; i< args.length; i++){
			arr[i]=Integer.parseInt(args[i]);
			arr1[i]=arr[i];
		}	
		
		insertionSort(arr1,1);
		
		out.println("Enter taget to be matched: ");
		int target = inp.nextInt();
		getPairs(target);
		
		out.println("Pairs are: ");
		out.println(pairs);
	}
	
	public static void insertionSort(int[] arr1, int start){
		if(start > arr1.length-1){
			return;
		}
		
		else{
			insert(arr1,start);
			insertionSort(arr1, start+1); 
		}
	}
	
	public static void insert(int[] arr1, int start){
		int pos = start;
		
		while(pos > 0 && arr1[pos] < arr1[pos-1]){
			swap(arr1, pos);
			pos = pos-1;
		}
	}
	
	public static void swap(int[] arr1, int pos){
		int temp=arr1[pos-1];
		arr1[pos-1]=arr1[pos];
		arr1[pos]=temp;
	}
	
	public static void display(int[] arr){
		out.print("[ ");
		for(int i=0; i<arr.length; i++){
			out.print(" "+arr[i]+",");
		}
		out.println(" ]");
	}
	
	public static void getPairs(int target){
		int start = 0,sum;
		int end = arr1.length-1;
		
		while(start < end){
			sum = arr1[start]+arr1[end];
			
			if(sum == target){
				pairs.add(new Pair(arr1[start],arr1[end]));
				++start;
				--end;
			}
			else if(sum > target){
				--end;
			}
			else{
				++start;
			}
		}
	}
}

class Pair{
	int x;
	int y;
	
	Pair(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString(){
		return "{ "+ this.x + ", " +this.y+" }";
	}
}