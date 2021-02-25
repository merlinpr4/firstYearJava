import java.util.ArrayList;
public class BankCustomer {

	private int accountNumber;
	private String customerName;
	private String customerAddress;
	private int customerDateOfBirth;

	public int getAccountNumber ()
	{
		return accountNumber ;
	}

	public void setAccountNumber(int customerAccountNumber)
	{
		accountNumber = customerAccountNumber;
	}

	public String getCustomerName ()
	{
		return customerName ;
	}

	public void setCustomerName(String customerAccountName)
	{
		customerName = customerAccountName;
	}

	public String getCustomerAddress ()
	{
		return customerAddress ;
	}

	public void setCustomerAddress(String customerAccountAddress)
	{
		customerAddress = customerAccountAddress;
	}

	public int getcustomerDateOfBirth ()
	{
		return customerDateOfBirth ;
	}

	public void setCustomerDateOfBirth(int customerDOB)
	{
		customerDateOfBirth= customerDOB ;
	}


	public static void main(String[] args) {

		//	BankCustomer one = new BankCustomer ();
		/*	
		one.setAccountNumber (123);
		one.setCustomerAddress("abc");
		one.setCustomerDateOfBirth(607);
		one.setCustomerName("Bill");
		System.out.println(one.getAccountNumber());

		System.out.println(one.getCustomerName());


		//you can try more later

		System.out.println(one.getCustomerAddress());
		 */

	/*	BankCustomer [] bankCustomerArray = new BankCustomer [10] ;
		for (int index = 0 ; index <bankCustomerArray.length ; index ++)
		{
			bankCustomerArray [index] = new BankCustomer () ;
		}
		bankCustomerArray[0].setAccountNumber (127);
		System.out.println (bankCustomerArray[0].getAccountNumber());
		bankCustomerArray[0].setAccountNumber (134);
		System.out.println (bankCustomerArray[0].getAccountNumber());
	} */
		 public static String findCustomer(ArrayList<BankCustomer> array, int accNumber)
		    {
			int i = 0;
			boolean found = false;
			while(!found)
		        {
			    if(array.get(i).accountNumber == accNumber)
				found = true;
			    else
				i++;
			}
			return array.get(i).customerName;
		    }

/*	public String findCustomer(int accountNumber, BankCustomer [] bankCustomerArray )
	{
		String name = "";
		for (int index = 0 ; index <bankCustomerArray.length ; index ++)
		{
			BankCustomer Customer = bankCustomerArray[index] ;
			int numberAccount = accountNumber ;
			if (numberAccount == Customer.accountNumber )
			{
				name = Customer.getCustomerName();
			}
			
		}
		return name;
	}


		public String findCustomer( int customerDateOfBirth, String customerAddress, BankCustomer [] bankCustomerArray)
		{
			String name = "";
			for (int index = 0 ; index <bankCustomerArray.length ; index ++)
			{
				BankCustomer Customer = bankCustomerArray[index] ;

				int DOB = customerDateOfBirth;
				String Address = customerAddress ;

				if (DOB == Customer.customerDateOfBirth && Address == Customer.customerAddress)
				{
					name = Customer.getCustomerName();
				}

			}
			return name;
		}



*/
		   public static void main(String[] args)
		    {
			ArrayList<BankCustomer> bankCustomers = new ArrayList<BankCustomer>();
			
			bankCustomers.add(new BankCustomer());
			bankCustomers.get(0).setAccountNumber(12345);
			bankCustomers.get(0).setCustomerName("Joe Rooney");
			bankCustomers.get(0).setCustomerAddress("Apt 2, Trinity College");
			bankCustomers.get(0).setCustomerDateOfBirth(210598);

			String cus;
		        cus = findCustomer(bankCustomers, 12345);
			System.out.printf("%n%s%n", cus);
		    }







	}
