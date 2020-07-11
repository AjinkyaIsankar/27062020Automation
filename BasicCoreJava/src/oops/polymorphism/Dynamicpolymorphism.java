package oops.polymorphism;

import oops.inheritance.Mobiles;
import oops.inheritance.SmartPhones;
import oops.inheritance.Telephone;

public class Dynamicpolymorphism {

	public static void main(String[] args) {
		// we can create object of parent class

		/*
		 * SmartPhones obj =new SmartPhones(); Mobiles obj2 =new SmartPhones();
		 * Telephone obj3 = new SmartPhones(); //SmartPhones obj4= new Mobiles();
		 */
		// If you are using ref of your parent class for the object of child class then
		// you can call the objects of parent class
		/*
		 * Telephone obj4; obj4=new Telephone(); obj4.calling();
		 * 
		 * obj4= new Mobiles(); obj4.calling();
		 * 
		 * obj4=new SmartPhones(); obj4.calling();
		 */

		Telephone obj4 = null; // Webdriver

		String browserName = "Chrome";

		if (browserName.equals("Chrome")) {
			obj4 = new Mobiles();// ChromeDriver
		} else if (browserName.equals("Firefox")) {
			obj4 = new SmartPhones();// FirefoxDriver
		}
		//Script Start
		obj4.calling();
	}

}
