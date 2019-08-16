package sixpointfour;

public class AnotherBankBites {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			BankAtm atm1 = new BankAtm("001", "Bad Bank", "Rockville", 25643);
			BankAtm atm2 = new BankAtm("002", "Worse Bank", "Fredericksburg", 9568);
			BankAtm atm3 = new BankAtm("003", "Wells Fargo", "Bethesda", 7432);

			try {
				atm1.printBalance();
				System.out.println("Withdrawing 5000...");
				atm1.withdraw(5000);
			} catch (BankATMException e) {
				e.printStackTrace();
			}
			System.out.println();
			try {
				atm3.printBalance();
				System.out.println("Withdrawing 12000...");
				atm3.withdraw(12000);
			} catch (BankATMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
			atm2.printBalance();
			System.out.println("Depositing 13000...");
			atm2.deposit(13000);
			atm2.printBalance();

	}
}
