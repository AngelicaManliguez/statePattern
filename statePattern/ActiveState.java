package statePattern;

public class ActiveState implements AccountState {

	@Override
	public void deposit(Double depositAmount, Account account) {
		account.setBalance(account.getBalance() + depositAmount);
		System.out.println("\nDeposit Successfully!");
		account.toString();
	}

	@Override
	public void withdraw(Double withdrawAmount, Account account) {
		account.setBalance(account.getBalance() - withdrawAmount);
		System.out.println("Withdraw Successfully!");
		account.toString();
	}

	@Override
	public void suspendState(Account account) {
		account.setAccountState(new SuspendState());
		System.out.println("Account is suspended!");
	}

	@Override
	public void activateState(Account account) {
		System.out.println("Account is already activated!");
	}

	@Override
	public void closeState(Account account) {
		account.setAccountState(new CloseState());
		System.out.println("Account is closed!");
		
	}
}
