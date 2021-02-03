package assignment2Q3;

public class savings extends assignment{
	 int totalDeposits = 10000;
	    int fixedDepositAmount = 5000;
	    @Override
	    public int getCash() {
	    	return totalDeposits+fixedDepositAmount;
	    }
}
