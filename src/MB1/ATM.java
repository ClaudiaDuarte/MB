package MB1;

public class ATM {

	private int idATM;
	private int totalMoney;
	private Account conta;
	
	//construtor
	public ATM(int totalMoney, Account conta) {
		super();
		this.totalMoney = totalMoney;
		this.conta = conta;
		
	}
	
	public int getMoneyFromAccout(int pin, int value){
		if( pin == conta.getPin()){
		conta.setBalance(conta.getBalance()-value);
		totalMoney -= value;
		System.out.println("Operation completed");
			return value;
		
		}else {
			System.out.println("Wrong Pin");
			return 0;
		}
	}
	
	public int getBalenceInfo(int pin){
		if( pin == conta.getPin()){
			
				return conta.getBalance();
			
			}else {
				System.out.println("Wrong Pin");
				return 0;
			}
	}
}
