import java.io.*;

public class Prime {
	 public static void main (String[] args) throws IOException {

		    // Defines the standard input stream
		    BufferedReader stdin = new BufferedReader
		      (new InputStreamReader(System.in));
		    String message; 

		    System.out.print ("Enter a number here, I will find all the prime number before it : ");
		    System.out.flush(); // empties buffer, before you input text
		    message = stdin.readLine();
		    int inputNumber;
	    	try{
	    		inputNumber = Integer.parseInt(message);
	    		System.out.println("Here are the primes:  ");
	    		int count = 0;
	    		for( int i = 2; i <= inputNumber; i++){
	    			boolean prime = isThisPrimeNumber(i);
	    			if(prime == true ){
	    				count++;
	    				System.out.print(i + "\t");
	    				if( count % 10 ==0 ){
	    					System.out.println();
	    				}
	    			}
	    		}
		    	
	    	} 
	    	catch(NumberFormatException e){
	    		System.out.println("We thing this is not a valid integer, Please try again");
	    	}

		  } // method main

	private static boolean isThisPrimeNumber(int i) {
		for(int k = 2; k < i; k++){
			if( i % k == 0 )
				return false;
		}
		return true;
	}
}
