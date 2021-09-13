package pack;

public class Test {
	   public static void main(String[] args) {  
		   int data=8,a; //may throw exception
	        int j=2;
	        try  
	        {  
	        	System.out.println(data/j);
	        }  
	            //handling the exception  
	        catch(ArithmeticException b)  
	        {  
	        	 System.out.println(data/(j+2)); 
	              
	        }  
	       
	    }  
}
