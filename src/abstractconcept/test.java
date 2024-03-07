package abstractconcept;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hdfc obj= new hdfc();
		obj.credit();
		obj.loan();
		obj.debit();
		obj.fund_hdfc();
		
		bank obj2= new hdfc();//dynamic polymorphism
		obj2.credit();
		obj2.debit();
		obj2.loan();
		
		//this scenario is regarding the overloading the main method
		Mainoverload.main(args);
	}

}
