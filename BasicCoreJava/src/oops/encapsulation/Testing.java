package oops.encapsulation;

public class Testing {

	private int age;
//Every time create private method
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0)
		this.age = age;
	}

}
