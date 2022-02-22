package Day11;

public class Prog5 {

	public static void main(String[] args) {
		 try
	       {
	             System.out.println(4/0);
	             System.out.println("end of try!");
	        }
		 catch(ArithmeticException e)
	        {
	            System.out.println("divide by 0");
	        }

	}

}
