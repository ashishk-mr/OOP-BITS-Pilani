import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(in);
		String str;
		out.println("Enter the string: ");
		str = scan.nextLine();
		
		String arr[]=Split(str);
		
		out.println("Labels are: ");
		out.println();
		for(String st:arr) {
			out.println(st);
		}
		
		String ulab[] = UniqueLabels(arr);
		out.println("Unique Labels: ");
		out.println();
		for(int m=0; m<ulab.length; m++) {
			out.println(ulab[m]);
		}
		
		String count[] = Count(arr, ulab);
		out.println("\nLabel count: ");
		for(int f=0; f<count.length; f++) {
			out.println("Label: "+ulab[f]+" -- "+"count: "+count[f]);
		}
		scan.close();
	}
	
	public static String[] Split(String str) {
		StringTokenizer st = new StringTokenizer(str,"#");
		String arr[]=new String[st.countTokens()];
		int i=0;
		StringTokenizer st1;
		int len=0;
		
		while(st.hasMoreTokens()) {
			arr[i]=st.nextToken();
			st1 = new StringTokenizer(arr[i]," ");
			len = len+st1.countTokens();
			//out.println("A");
			//out.println(arr[i]);
			++i;
		}
		
		String arr2[]=new String[len];
		int ind = 0;
		for(int j=0; j<arr.length; j++) {
			//out.println(arr[j]);
			String arr3[] = (arr[j]).split(" ");
			for(int k=0; k<arr3.length; k++) {
				arr2[ind]=arr3[k];
				++ind;
			}
		}
		
		return arr2;
	}
	
	public static String[] UniqueLabels(String[] arr) {
		String ans[] = new String[arr.length];
		int ind=1;
		int j=0;
		
		ans[0]=arr[0];
		for(int i=1; i<arr.length; ++i) {
			for(j=0; j<ans.length; ++j) {
				if(arr[i].equalsIgnoreCase(ans[j])) {
					break;
				}
			}
			if(j==ans.length) {
				ans[ind]=arr[i];
				ind++;
			}
			
			else {
				continue;
			}
		}
		
		int len=0;
		for(int n=0; n<ans.length; n++) {
			if(ans[n]==null) {
				break;
			}
			else {
				len++;
			}
		}
		
		String ans1[] = new String[len];
		for(int o=0; o<ans1.length; o++) {
			ans1[o]=ans[o];
		}
		
		return ans1;
	}
	
	public static String[] Count(String[] tok, String[] label) {
		String[] ct = new String[label.length];
		int c;
		for(int i=0; i<label.length; i++) {
			c =0;
			for(String st:tok) {
				if(st.equalsIgnoreCase(label[i])) {
					++c;
				}
			}
			ct[i] = String.valueOf(c);
		}
		
		return ct;
	}
}