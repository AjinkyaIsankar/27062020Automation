package functions;

public class Returntype {

	public static void main(String[] args) {
		int add=sum(10,20);
		System.out.println(add);
		
		boolean c=eligible(18);
		System.out.println(c);
		if(c)
		{
			System.out.println("You are Eligible");
		}
		else
		{
			System.out.println("You are not Eligible");
		}
		}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}
	
	public static boolean eligible(int age)
	{
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
