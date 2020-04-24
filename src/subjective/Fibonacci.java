package subjective;

public class Fibonacci {

	public static void main(String[] args) {
		
		int number=5, n1=0, n2=1,sum;
		System.out.println("Fibonacci using For loop");
		System.out.println(n1);
		
		for (int i=1; i<=number; ++i)
        {            
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println(n1);
        }
		
		System.out.println("Fibonacci using While loop");
		int j=1,num1=0, num2=1,sum2;
		System.out.println(num1);
		
		while (j <= 10)
        {
            sum2 = num1 + num2;
            num1 = num2;
            num2 = sum2;
            System.out.println(num1);
            ++j;         
        }
	}
}
/*output:
 
Fibonacci using For loop
0
1
1
2
3
5
Fibonacci using While loop
0
1
1
2
3
5
8
13
21
34
55
*/