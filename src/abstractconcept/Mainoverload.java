package abstractconcept;

public class Mainoverload {

	
	public static void main(String[] args) {
		System.out.println("Main Method 1");
		main("Pawan");
		main(4);
		main(0.6);
	}
	public static void main(String args) {
		System.out.println("Main Method 1");
	}
	public static void main(int num) {
		System.out.println("Main Method 2");
	}
	public static void main(double args) {
		System.out.println("Main Method 3");
	}
	

}
