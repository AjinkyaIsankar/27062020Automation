package oops.polymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
		
		//Two types of Polymorphism
		//Method Overloading is Static Polymorphism
		//Polymorphism Combination of overloading and overriding
		
		Methodoverloading obj = new Methodoverloading();
		obj.sum(10, 20, 30);
		obj.sum(40, 50);
	}
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sum(int a, int b, int c)
	{
		return a+b+c;
	}
}
