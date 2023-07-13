class BankTester{
	public static void main(String[] args) {
		boolean verifyTransaction;
		verifyTransaction=BankAccount.credit(5000);
		if(verifyTransaction){
			System.out.println("transaction successful\n");}
			else System.out.println("transaction failed\n");
		verifyTransaction=BankAccount.debit(10000);
		if(verifyTransaction){
			System.out.println("transaction successful\n");}
			else System.out.println("transaction failed\n");
		verifyTransaction=BankAccount.debit(5000);
		if(verifyTransaction){
			System.out.println("transaction successful\n");}
			else System.out.println("transaction failed\n");
		verifyTransaction=BankAccount.debit(5000);
		if(verifyTransaction){
			System.out.println("transaction successful\n");}
			else System.out.println("transaction failed\n");
	}
}