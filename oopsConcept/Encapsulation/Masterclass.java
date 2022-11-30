package Encapsulation;

public class Masterclass {

	public static void main(String[] args) {
		
		BalanceEnquiry Bala=new BalanceEnquiry();
		
		Bala.getBalance();
		
		//------------------------------------
		
		Bala.setBalance(50000);
        Bala.getBalance();
	}

}
