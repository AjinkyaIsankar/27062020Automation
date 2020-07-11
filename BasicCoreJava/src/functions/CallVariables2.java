package functions;

public class CallVariables2 {

	public static void main(String[] args) {

		// Created New object
		Variables2 def = new Variables2();

		// Replaced given names
		def.name = "Rahul";
		def.name2 = "Rajesh";
		Variables2 def2 = new Variables2();
		System.out.println(def2.name2);
		System.out.println(def2.name);

		// Called the Variables
		System.out.println(def.name2);
		System.out.println(def.name);
	}

}
