package functions;

public class Functions1 {

	public static void main(String[] args) {
		
		//Call a function
		sum();
	}
	
	
	//Public			//Static				//Void									//Anything Except		//Any datatype(Primitive+Non Primitive)
	//Private			//No Keyword(Non Static)//any datatype(Primitive+Non Primitive)	//reserved keyword
	//Protected
	public 				static 					void 									sum						() 
	//Access Modifier	//Nature of your method	//Return types							//Name of your method	//Parameters
	{
		int a = 10;
		int b = 20;
		System.out.println(a + b);

		int c = 30;
		System.out.println(b + c);

		int d = 40;
		int e = 50;
		System.out.println(d + e);
	}
}
