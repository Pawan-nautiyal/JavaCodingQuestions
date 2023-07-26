package abstractconcept;

public class Tata implements Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car is started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

		System.out.println("Car is stopped right now");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub

		System.out.println("Car is Refueled");
	}
	
	//non ovveride method
	public void check_engine()
	{
		System.out.println("Checking the engine");
	}

	
}
