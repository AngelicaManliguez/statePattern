package statePattern;

public class CloseState implements AccountState {
	
	private Account account;
	
	public CloseState(Account account)
	{
		this.account = account;
	}
	
	@Override
	public void deposit(Double depositAmount) {
		System.out.println("You cannot deposit on closed account account!");
		account.toString();
	}

	@Override
	public void withdraw(Double withdrawAmount) {
		System.out.println("You cannot withdraw on a closed account!");
		account.toString();
	}

	@Override
	public void suspendState(Account account) {
		System.out.println("You cannot suspend a closed account!");
	}

	@Override
	public void activateState(Account account) {
		System.out.println("You cannot activate a closed account!");
	}

	@Override
	public void closeState(Account account) {
		System.out.println("Account is already closed!");
		
	}

}
