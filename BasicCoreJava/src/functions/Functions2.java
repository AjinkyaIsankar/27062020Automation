package functions;

public class Functions2 {
	
	public static String name="Ajinkya";

	public static void main(String[] args) {
		
		
		/*sum(10,20);
		sum(20,30);
		sum(40,50);
		sum(10,20,30);
		message("Ajinkya");
		Eligibility("Ajinkya", 27);
		Eligibility("ABC", 18);*/
		
		System.out.println(name);
		
	}
	
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	//whenever we have two or more function with same name and different no of parameters is method overloading
	
	public static void message(String name)
	{
		System.out.println("Welcome "+name);
	}
	
	public static void Eligibility(String name, int age)
	{
		
		System.out.println("Ajinkya you are eligible");
		System.out.println("Anand you are not eligible");
	}
	
	
}
