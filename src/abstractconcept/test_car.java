package abstractconcept;

public class test_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tata ratan= new Tata();
		
		ratan.start();
		ratan.stop();
		ratan.refuel();
		ratan.check_engine();
		
//child class object can be refered by parent class or parent interface refrence variable is called dynamic polymorphism 
		Car c= new Tata();
		c.start();
		c.stop();
		c.refuel();
		

	}

}
