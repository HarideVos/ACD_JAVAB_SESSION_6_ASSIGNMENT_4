package sixpointfour;

class BankAtm {
	String atmId;
	String bankName;
	String location;
	double balance;

	BankAtm(String atmId, String bankName, String location, double balance) {
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}

	void withdraw(double amt) throws BankATMException {
		if (balance < 10000)
			throw new BankATMException("Cannot withdraw. Balance is below $10000");
		else if (balance < amt)
			throw new BankATMException("Cannot withdraw. Your balance is only $" + balance);
		else
			balance = balance - amt;
	}

	void deposit(double amt) {
		balance = balance + amt;
	}

	void printBalance() {
		System.out.println(atmId + " Balance $" + balance);
	}
}