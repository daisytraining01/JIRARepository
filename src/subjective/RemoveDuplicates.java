package subjective;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap<String,String>();
		
		hm.put("Key 1","TestVal1");
		hm.put("Key 2","TestVal2");
		hm.put("Key 3","TestVal1");
		hm.put("Key 4","TestVal2");
		hm.put("Key 5","TestVal1");
		hm.put("Key 6","TestVal2");
		
		Set<String> set1=hm.keySet();
		
		Iterator<String> iter=set1.iterator();
		String nextvalue="",key="",value="";
		
		while(iter.hasNext()) {
			
			key=iter.next();
			value=hm.get(key);			
			nextvalue=hm.get(key);
		}
			if(value.equals(nextvalue)) {
			hm.remove(key);
			
		}
		System.out.println(hm);		
	}

}/*
output:
	
{Key 1=TestVal1, Key 2=TestVal2, Key 3=TestVal1, Key 4=TestVal2, Key 5=TestVal1}*/