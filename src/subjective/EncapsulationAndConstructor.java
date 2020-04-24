package subjective;

public class EncapsulationAndConstructor {
	
	private int age;
	private String name;
	private int contactNumber;
	private double yrs_of_exp;
	
	EncapsulationAndConstructor(){   //default constructor
		System.out.println("Default Constructor");
		}
	
	EncapsulationAndConstructor(int a,int b){   //parameterized constructor
		System.out.println("parameterized constructor");
		int c=a+b;
		System.out.println("the value of C is :"+c);
	}
	
	//Getters and Setters
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getYrs_of_exp() {
		return yrs_of_exp;
	}
	public void setYrs_of_exp(double yrs_of_exp) {
		this.yrs_of_exp = yrs_of_exp;
	}
	
	

}
