package subjective;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class FirstInFirstOut {

	public static void main(String[] args) {
		
	Queue<Integer> queue=new LinkedList<Integer>();
	
	queue.add(20);
	queue.add(30);
	queue.add(40);
	System.out.println("The elements in the Queue :"+queue);
	
	queue.remove();//removes 20
	queue.remove();//removes 30
	
	System.out.println("The elements in the Queue after removing:"+queue);	
	}
	
}
/*output:
	
	The elements in the Queue :[20, 30, 40]
	The elements in the Queue after removing:[40]*/
