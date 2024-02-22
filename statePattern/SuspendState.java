package statePattern;

public class SuspendState implements AccountState {

	private Account account;
	
	public SuspendState(Account account)
	{
		this.account = account;
	}
	
	@Override
	public void deposit(Double depositAmount) {
		account.setBalance(account.getBalance() + depositAmount);
		System.out.println("Deposit Successfully!");
		account.toString();
	}

	@Override
	public void withdraw(Double withdrawAmount) {
		account.setBalance(account.getBalance() - withdrawAmount);
		System.out.println("Withdraw Successfully!");
		account.toString();
	}

	@Override
	public void suspendState(Account account) {
		System.out.println("Account is already suspended!");
		
	}

	@Override
	public void activateState(Account account) {
		account.setAccountState(new SuspendState(account));
		System.out.println("Account is activated!");
		
	}

	@Override
	public void closeState(Account account) {
		account.setAccountState(new CloseState(account));
		System.out.println("Account is closed!");
		
	}

}
