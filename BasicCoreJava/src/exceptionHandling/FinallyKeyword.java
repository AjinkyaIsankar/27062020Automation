package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		try {
			System.out.println("Open the Data base connection");
			System.out.println(10/2);
			System.out.println("Ajinkya");
			System.out.println("Close the connection");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("");
		}

	}

}
