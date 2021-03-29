
public class NameTest {

	public static void main(String[] args) {
		Name name = new Name("Singh;Kumar;Ashish");
		
		System.out.println(name.getName());
		System.out.println(name);
		
		Name n1 = new Name("Mohit,Kumar,Singh");
		
		System.out.println(n1.getName());
		System.out.println(n1);
	}

}
