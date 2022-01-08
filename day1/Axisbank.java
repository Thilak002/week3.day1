package week3.day1;

public class Axisbank extends Bankinfo{
      public void deposit() {
		System.out.println("is deposited in axis bank");

	}
	public static void main(String[] args) {
		Axisbank bank = new Axisbank();
		bank.saving();
		bank.fixed();
		bank.deposit();

	}

}
