package subjective;

public class OverloadingChild implements MyInterface{

	int one,two;
	
	public static void main(String[] args) {
		
		OverloadingChild obj=new OverloadingChild();
		System.out.println(obj.sum());
		System.out.println(obj.sum(5, 3));//method overloading
		obj.display();
	}

	@Override
	public int sum() {
		int c=a+b;
		return c;
	}

	@Override
	public void display() {
		System.out.println("Interface method");		
	}
	
	public int sum(int one,int two) {
		
		int three=one*two;
		return three;
	}

}
/*output:
	
	30
	15
	Interface method*/