package exceptionHandling;

public class TryCatchBlock {

	public static Functions fun = null;

	public static void main(String[] args) {

		// Functions f = new Functions();
		// Step 1-Verify About link is present
		try {
			int a = 10;
			int b = 10;
			System.out.println(a / b);
			/*
			 * } catch(Exception e) { System.out.println("Exception Occurred:" +
			 * e.getMessage()); }
			 */

			// Step 2 - Verify download link is present
			String[] str = new String[2];
			str[2] = "Ajinkya";

			// Step 3 - Verify Projects link is present
			fun.fun1();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occurred:" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurred:" + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Occurred:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unknown Exception Occurred:" + e.getMessage());
		}
	}
}
