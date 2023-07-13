class BankAccount{
	static double currentBalance=10000.0;
	public static boolean credit(int amount){
		System.out.println("Processing credit of:"+amount);
		double tempDebit=currentBalance+amount;
        if(tempDebit>currentBalance){
         	currentBalance=tempDebit;
         	System.out.println("New Balance is:"+currentBalance);
	     	return true;
         }
        else
	    return  false;
	}
	public static boolean debit(int amount){
		System.out.println("Processing debit of:"+amount);
		double temp=currentBalance;
		if(currentBalance>=amount){
 			temp=currentBalance-amount;
		   }
		if(temp<currentBalance){
			currentBalance=temp;
			System.out.println("The current balance is:"+currentBalance);
			return true;
		   }
		if(temp>=currentBalance){
			System.out.println("Insufficient Balance..");
			return false;
		  }
	
		return false;
       }
}