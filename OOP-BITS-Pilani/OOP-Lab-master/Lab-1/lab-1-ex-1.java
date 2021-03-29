import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Vector;
import java.util.Iterator;

class Test{
	static int i = 3;
	static Vector<Integer> vec = new Vector<Integer>();
	
	public static void main(String[] args){
		int index = Integer.parseInt(args[0]);
		
		fiboCal(index);
	}
	
	public static void fiboCal(int n){
		try{
			if(n == 1){
				vec = new Vector<Integer>();
				out.println("A");
				initVec();
				displayFib();
				return;
			}
			else if(n == 2){
				vec = new Vector<Integer>();
				out.println("B");
				initVec();
				displayFib();
				return;
			}
			else{
				if(i==3){
					vec = new Vector<Integer>();
					out.println("C");
					initVec();
					out.println("D");
					out.println(vec);
				}
				while(i != n){
					out.println(vec);
					vec.set(i-1,vec.elementAt(i-2)+vec.elementAt(i-3)+vec.elementAt(i-1)); // vec[int i] does not work with java vectors.
					i++;
				}
			}
		}
		catch(Exception e){
			out.println(e.getMessage());
		}
	}
	
	private static void displayFib(){
		Iterator it = vec.iterator();
		out.print("[ ");
		while(it.hasNext()){
			Integer i = (Integer)it.next();
			out.print(" "+i+",");
		}
		out.println(" ]");
	}
	
    public void initVec(){
		int a=1;
		for(int i=0; i<2; i++){
			vec.set(i, a);
		}
	}
}