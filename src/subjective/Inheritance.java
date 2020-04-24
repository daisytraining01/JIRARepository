package subjective;

public class Inheritance extends EncapsulationAndConstructor{

	public static void main(String[] args) {
		
		Inheritance object=new Inheritance();
		object.childMethod();
		
		//calling parameterized constructor		
		EncapsulationAndConstructor object2=new EncapsulationAndConstructor(70,90);
		object2.setAge(30);
		object2.setContactNumber(123456689);
		object2.setName("pinky");
		object2.setYrs_of_exp(10.5);
		
		System.out.println(object2.getName());
		System.out.println(	object2.getAge());
		System.out.println(	object2.getContactNumber());
		System.out.println(object2.getYrs_of_exp());		
	
	}

	public void childMethod() {
		
	System.out.println("child class method");
	}
}
/*
output:

Default Constructor
child class method
parameterized constructor
the value of C is :160
pinky
30
123456689
10.5*/