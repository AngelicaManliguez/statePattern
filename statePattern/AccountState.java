package statePattern;

public interface AccountState {
	
    public void deposit(Double depositAmount, Account account);
    public void withdraw(Double withdrawAmount, Account account);
    
    public void suspendState(Account account);
    public void activateState(Account account);
    public void closeState(Account account);
    
    public String toString();
	

}
