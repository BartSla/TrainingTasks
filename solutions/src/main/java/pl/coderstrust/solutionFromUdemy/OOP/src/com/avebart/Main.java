package pl.coderstrust.solutionFromUdemy.OOP.src.com.avebart;

public class Main {

    public static void main(String[] args) {
		Bank konto = new Bank();


		konto.setBalance(1236.0);
		konto.deposit(11000.0);
		konto.withdraw(20000.0);

		VipCustomer bartek = new VipCustomer("Bartek", 11000, "bartek@wp.pl");
		System.out.println(bartek.getCreditLimit());


		VipCustomer bartek2 = new VipCustomer("Bartek", "bartek@wp.pl");


		System.out.println(bartek2.getCreditLimit());


	/*
	konto.setAccountNumber(12345678987654321L);
	konto.setBalance(120000);
	konto.setUserName("Bartek");
	konto.setEmail("bartek@wp.pl");
	konto.setPhoneNumber(322555485);

	konto.incrementDeposit(11000);
        System.out.println(konto.getUserName()+ " deposit " + konto.deposit + " on bank account" + konto.getAccountNumber() + " by phone number " +  konto.getPhoneNumber());
		System.out.println("Actual bank account balance is " + konto.getBalance());
	konto.withdrawDeposit(300);
		System.out.println(konto.getUserName() + " withdraw " + konto.withdraw + " and actual account balance is " + konto.getBalance());
		System.out.println("Bank send on email: " + konto.getEmail() + " account balance " + konto.getBalance());
	*/
	}
}
