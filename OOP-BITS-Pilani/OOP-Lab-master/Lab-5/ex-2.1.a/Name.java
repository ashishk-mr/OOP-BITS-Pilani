import java.util.StringTokenizer;
public class Name {
	private String fname;
	private String mname;
	private String lname;
	
	Name(String name){
		String str = name;
		int i=0;
		String str1[]=new String[3];
		if(str.indexOf(';')!=-1) {
			StringTokenizer st = new StringTokenizer(str,";");
			while(st.hasMoreTokens()) {
				str1[i]=st.nextToken();
				++i;
			}
			lname = str1[0];
			mname = str1[1];
			fname = str1[2];
		}
		
		else if(str.indexOf(',')!=-1) {
			StringTokenizer st = new StringTokenizer(str,",");
			while(st.hasMoreTokens()) {
				str1[i]=st.nextToken();
				++i;
			}
			
			fname = str1[0];
			mname = str1[1];
			lname = str1[2];
		}
	}
	
	public String getName() {
		return fname+" "+mname+" "+lname;
	}

	@Override
	public String toString() {
		return fname+mname+lname;
	}
}