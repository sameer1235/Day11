package Day11;

public class Prog2 {

	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("End of program!");


	}

}
