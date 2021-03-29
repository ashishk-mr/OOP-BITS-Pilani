import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Vector;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;

class Test{
	public static Vector<Integer> num = new Vector<Integer>();
	public static LinkedHashSet<Integer> answer = new LinkedHashSet<Integer>();
	static int total;
	
	public static void main(String[] args){
		Scanner scan = new Scanner(in);
		
		out.println("Enter number: ");
		int num = scan.nextInt();
		
		Test1.extractDig(num);
		Test1.formPerm3D();
		out.println("Total 3 digit permutation: "+total);
		out.println("3 digit non-duplicate permutations of number " + num);
		out.println();
		out.println(answer);
	}
}

class Test1{
	public static void extractDig(int numb){
		while(numb != 0){
			int rem = numb%10;
			(Test.num).add(0,rem);
			numb = numb/10;
		}
	}
	
	public static void formPerm3D(){
		Test.total=0;
		for(int i=0; i<Test.num.size(); i++){
			for(int j=0; j<Test.num.size(); j++){
				for(int k=0; k<Test.num.size(); k++){
					if(Test.num.get(i) == 0){
						continue;
					}
					else{
						int permutation = Test.num.get(i)*100 + Test.num.get(j)*10 + Test.num.get(k);
						Test.answer.add(permutation);
					}
				}
			}
		}
		Test.total = Test.answer.size();
	}
}