package statePattern;

public class Account {
	
	private AccountState accountState;
    private String accountNumber;
    private Double balance;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    	this.accountState = new ActiveState(this);
    }

    public String getAccountNumber()
    {
    	return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber)
    {
    	this.accountNumber = accountNumber;
    }
    
    public Double getBalance()
    {
    	return balance;
    }
    
    public void setBalance(Double balance)
    {
    	this.balance = balance;
    }
    
    public void setAccountState(AccountState accountState)
    {
        this.accountState = accountState;
    }

    public void deposit(Double depositAmount)
    {
	    accountState.deposit(depositAmount);
    }
   
    public void withdraw(Double withdrawAmount)
    {
	    accountState.withdraw(withdrawAmount);
    }
    
    public void suspend()
    {
	    accountState.suspendState(this);
    }
    
    public void closed()
    {
    	accountState.closeState(this);
    }
   
    public void activate()
    {
    	accountState.activateState(this);
    }
    
    public String toString()
    {
    	System.out.println("Account number: " + accountNumber + " Balance: " + balance); 
    	return null;
    }

}
