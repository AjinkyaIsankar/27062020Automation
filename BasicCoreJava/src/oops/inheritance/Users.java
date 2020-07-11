package oops.inheritance;

public class Users {

	public static void main(String[] args) {
		//Multiple inheritance is not possible in class of JAVA
		//Multilevel inheritance is possible
		SmartPhones sm= new SmartPhones();
		sm.calling();
		sm.texting();
		sm.VideoCall();
		
		sm.calling(50);
		
		/*
		 * Mobiles mob = new Mobiles(); mob.calling(); mob.texting();
		 * 
		 * Telephone tel = new Telephone(); tel.calling();
		 */

	}

}
