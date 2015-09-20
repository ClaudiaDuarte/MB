package MB1;

public class Account {
	
	private int idAccount;
	private int pin;
	private int balance;
	
	
	
	//construtor
	public Account(int pin, int balance) {
		super();
		this.pin = pin;
		this.balance = balance;
	}
	
	
	// permite que outra classe redefina o valor do balance
	public void setBalance(int balance) {
		this.balance = balance;
	}



	//Metodos
	public int getIdAccount() {
		return idAccount;
	}
	public int getPin() {
		return pin;
	}
	public int getBalance() {
		return balance;
	}
	
	

}
