package abstractconcept;

public interface Car {
	//fully abstarction ie fully hiding the complete business logic
	
	// this is slow comparision to partial abstraction 
	
	//it can have only final and static variables
	final int ja=10;
	static int pa=12;
	
	//always define abstract methods
	//no method body at all
	//only method declaration
	//we can achieve 100% abstraction 
	//cannot create object of interface
	
	public void start();
	public void stop();
	public void refuel();
	
	

}
