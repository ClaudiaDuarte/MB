package MB1;

public class Person {
	
	//Vari‡veis
	private String name;
	private int pin;
	private int amount;
	
	
	public Person(String name, int pin, int amount) {
		super();
		this.name = name;
		this.pin = pin;
		this.amount = amount;
		
	}
	public String getName() {
		return name;
	}
	public int getPin() {
		return pin;
	}
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	
	
	
	
	
	
	
}
