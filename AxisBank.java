package week3.day1.Assigments;

public class AxisBank {
	public void deposit() {
		System.out.println("Deposit");	
	}
	
	public static void main(String[] args) {
		AxisBank axObj = new AxisBank();
		axObj.deposit();
		BankInfo bnkObj = new BankInfo();
		bnkObj.saving();
		bnkObj.fixed();
		bnkObj.deposit();
		

	}

}
