package VaraiblesAndDatatypes;

import functions.AccessModifiers;

public class TestAccessModAtProjectlevel extends AccessModifiers{

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.publicfunction();
		
	//You can access at project level by using child class object using extends
		
		TestAccessModAtProjectlevel obj2=new TestAccessModAtProjectlevel();
		obj2.protectedfunction();

	}

}
