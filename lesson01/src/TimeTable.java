import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeTable {
	 public static void main (String[] args) throws IOException {

		    // Defines the standard input stream
		    BufferedReader stdin = new BufferedReader
		      (new InputStreamReader(System.in));
		    String message; 

		    System.out.print ("Enter a number here, I will build the time table for you : ");
		    System.out.flush(); // empties buffer, before you input text
		    message = stdin.readLine();
		    int inputNumber;
	    	try{
	    		inputNumber = Integer.parseInt(message);
	    		System.out.println("Here are the primes:  ");

	    		for( int i = 1; i <= inputNumber; i++){
	    			BuildOneLine(i);
	    			System.out.println();
	    		}
		    	
	    	} 
	    	catch(NumberFormatException e){
	    		System.out.println("We thing this is not a valid integer, Please try again");
	    	}

		  } // method main

	private static void BuildOneLine(int i) {

		for(int r = 1; r <= i; r++){
			System.out.format("%d X %d = %d\t", r, i, r*i);
		}
		
	}

}
