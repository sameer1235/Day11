package Day11;

public class Prog6 {

	public static void main(String[] args) {
		 try{
	            System.out.println(4/0);
	           }
	        catch(ArithmeticException e){
	            System.out.println("divide by 0");
	        }

	}

}
