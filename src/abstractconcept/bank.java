package abstractconcept;

public abstract class bank {
	
	//fast comparision to interface or fully abstarction
	
	//it can have final,static and normal variable
	int abs=29;
	final int ja=10;
	static int pa=12;
	//partial abstraction
	///hiding the implementation logic is called abstraction
	//abstraction class has abstraction method and non abstract method
	//we cannot create object of abstract class
	
	
	public abstract void loan(); //abstract method we will not ddefine it here in abstract class
	
	//non abstract method
	public void credit() {
		
		System.out.println("Bank==crdeit");
		
	}
	public void debit() {
		System.out.println("Bank==debit");
	}

}
