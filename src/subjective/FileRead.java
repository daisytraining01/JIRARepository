package subjective;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("src/subjective/sample.txt");    
	    BufferedInputStream bin=new BufferedInputStream(fin);    
	    
	    int i,j=0;
	    while((i=bin.read())!=-1){ //read till end of file
	    	
	    	 System.out.print((char)i); 	    	
	    }        
	    
	    bin.close();    
	    fin.close();    
	}

}
/*ouput:
	
	first line
	second line
	third line
	fourth line*/