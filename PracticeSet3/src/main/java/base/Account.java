package base;
 
import java.util.Date;

public class Account {
	private int id; // default is 0
	private double balance; // default is 0
	private double annualInterestRate; // default is 0
	private Date dateCreated;

	public Account() {
		super();

	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate){
			this.annualInterestRate= annualInterestRate;
	}
 
	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	} 

	public double withdraw(double x) throws InsufficientFundsException {
		if (x <= balance) {
			balance -= x;
			return balance;
		} else {
			double over = x - balance;
			throw new InsufficientFundsException(over);
		}
	}

	public double deposit(double y){
			 balance+=y;
			 return balance;
		 }
}
