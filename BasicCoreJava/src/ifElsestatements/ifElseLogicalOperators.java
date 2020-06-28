package ifElsestatements;

public class ifElseLogicalOperators {

	public static void main(String[] args) {
		int age=25;
		boolean voterID=true;
		
		if(age>=18 && voterID) 
		{
			System.out.println("You are eligible");
		}
		else {
			System.out.println("You are not eligible");
		}
		
		//OR Operator
		boolean pancard=true;
		boolean aadharcard=true;
		
		if(pancard || aadharcard)
		{
			System.out.println("You are eligible");
		}else {
			System.out.println("You are not eliible");
		}

	}

}
