import static org.junit.Assert.*;

import org.junit.Test;

import base.Account;
import base.InsufficientFundsException;



public class Account_test {

	//test constructor, getters, setters 
	 
		@Test
		public void getter_setter_test()  {
			Account acc_test = new Account();
			
			acc_test.setAnnualInterestRate(4.5);
			acc_test.setId(1122);
			acc_test.setBalance(20000);
			
			acc_test.getMonthlyInterestRate();
			System.out.println(acc_test.getBalance());
			System.out.println(acc_test.getAnnualInterestRate());
			System.out.println(acc_test.getDateCreated());
			System.out.println(acc_test.getId());
			
		}
		
		// test deposit method
		@Test
		public void deposit_test()  {
			
			Account acc_test = new Account(1122, 20000);
			assertEquals(acc_test.deposit(3000),(20000+3000),0);
			
	  		
		}
		// test withdraw method without overdrawing
		@Test
		public void withdraw_test() throws InsufficientFundsException  {
			
			Account acc_test = new Account(1122, 20000);
			assertEquals(acc_test.withdraw(2500),(20000-2500),0);
			
			
		}
		// test withdraw method while overdrawing
		@Test(expected=InsufficientFundsException.class)
		public void withdraw_with_exception_test() throws InsufficientFundsException {
			
			Account acc_test = new Account(1122, 20000);
			acc_test.withdraw(20001);
			
		 	
			
		}

}
