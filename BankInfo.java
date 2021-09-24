package week3.day1;

public class BankInfo {
	
	public void Saving() {
		System.out.println("My Account type is savings");

	}
public void fixed() {
	System.out.println("My Mode of savings is fixed");

}
public void deposit() {
	System.out.println("Deposited for 2 years");

}

 public static void main (String[] args) {
	 
	 BankInfo obj = new BankInfo();
	 obj.Saving();
	 obj.fixed();
	 obj.deposit();
	 
	 AxisBank obj1 = new AxisBank();
	 obj1.deposit();
	 
			 
	
}

}

