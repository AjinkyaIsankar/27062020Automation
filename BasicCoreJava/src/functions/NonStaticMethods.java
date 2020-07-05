package functions;

public class NonStaticMethods {
	
	public String name="Ajinkya";
	public static String name2="Ajinkya Isankar";

	public static void main(String[] args) {
		// Static function can only call static methods and static variables
		
		NonStaticMethods obj=new NonStaticMethods();
		System.out.println(obj.name);
		
		

	}

}
