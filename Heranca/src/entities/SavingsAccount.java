package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() { //construtor padrão da classe account
		super();
	}

	public SavingsAccount(Integer number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate; // complementando atribuindo interestRaTE
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) { // saque
		balance -= amount;
	}
}
