package basics;

import java.util.*;
import java.io.*;

public class CreditCard {

	public static void main(String[] args) {
		double balance = -200;
		List<String[]> data = new ArrayList<String[]>();
		String filename = "E:\\Jinal's project\\Udemy\\Java\\CreditCardStmt.csv";
		String datarow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			datarow = br.readLine();
			while(datarow != null) {
				String[] line = datarow.split(",");
				data.add(line);
				datarow = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String[] row : data ) {
		//	System.out.print("[");
			for(String field : row) {
			//	System.out.print(field + " ");
				double amt = Double.parseDouble(row[3]);
				if(field.contains("CREDIT")) {
					balance = addamt(balance,amt);				
				}else if(field.contains("DEBIT")) {
					balance = subamt(balance,amt);
				}else if(field.contains("FEE")) {
					balance = subamt(balance,amt);
				}
			}
		//	System.out.println("]");
		}
		
		if(balance > 0) {
			balance =subamt(balance,balance*0.01);
			System.out.println("WARNING : Charging 10% fee! New balance " + balance);
		}else if(balance == 0) {
			System.out.println("Thank You for the payment!");
		}else {
			System.out.println("Thank You for the payment! Overpayment amount is "+Math.abs(balance));
		}


	}
	
	static double addamt(double balance,double amt) {
		
		balance = balance + amt;
		System.out.println("Balance after crediting "+amt +" is " +balance);
		return balance;
	}
	
	static double subamt(double balance,double amt) {
		
		balance = balance - amt;
		System.out.println("Balance after debiting "+amt +" is " +balance);
		return balance;
	}

}

/*
Read a credit card CSV statement
Creating a balance variable that calculates the running balance of the user’s account
If the field says CREDIT, then add the amount to the balance
If the field says DEBIT, then subtract the amount to the balance
If the final amount is greater than zero, charge a 10% fee and warn the user
If the final amount is zero, thank the user for their payments
If the final amount is less than zero, thank the user for their payment and display their overpayment.
*/