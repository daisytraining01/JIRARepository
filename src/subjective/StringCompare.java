package subjective;

public class StringCompare {

	public static void main(String[] args) {
		
		String str ="REST ASSURED";
		str=str.replaceAll("S","");
		str=str.replaceAll("T","");
		System.out.println("After Replacing the characters : "+str);
		
		String str2="REST";
		boolean compare=str.equals(str2);
		System.out.println(compare);
		
	}
}
/*output:
	
	After Replacing the characters : RE AURED
	false*/	