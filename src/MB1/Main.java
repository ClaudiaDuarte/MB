package MB1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("Claudia", 1234, 0);
		Account account1 = new Account(1234, 1000);
		
		ATM atm1 = new ATM(10000, account1);
		
		System.out.println(atm1.getBalenceInfo(person1.getPin()));
		System.out.println(atm1.getBalenceInfo(1245));
		
		System.out.println(person1.getAmount());
		
		int value1 = atm1.getMoneyFromAccout(person1.getPin(), 50);
		person1.setAmount(person1.getAmount() + value1);
		
		System.out.println(atm1.getBalenceInfo(person1.getPin()));
		System.out.println(person1.getAmount());
	}

}
