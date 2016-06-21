
//Kaitlin, Chelsea, Brandon
//Grand Circus Bootcamp
//Midterm Project- POINT OF SALE
// This is a point of sale app for an employee-manned cash register.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean newOrder;
		boolean goReceipt = false;
		boolean plusProduct = false;

		// loop for a complete transaction cycle
		do {

			// loop for shopping cart/receipt
			do {

				// Present Menu from ArrayList- Products

				// user inputs order product and quantity
				System.out.println("Choose product:");
				int productChoice = scan.nextInt();

				System.out.println("Choose Quantity:");
				int quantity = scan.nextInt();

				// set up new receipt/shopping cart
				Receipt receipt = new Receipt();

				// Ask to chose another product or checkout or new transaction
				System.out.println("New transaction? (N) \n Another product?(P) \n Checkout (C)");
				// add Validator
				String continu = scan.nextLine();
				if (continu.equalsIgnoreCase("N")) {
					// reset Shoppingcart array list
					// receipt.reset()
					newOrder = true;

				} else if (continu.equalsIgnoreCase("P")) {
					// build arraylist in receipt and save
					plusProduct = true;
				} else if (continu.equalsIgnoreCase("C")) {
					plusProduct = false;
					goReceipt = true;
				}
			} while (plusProduct = false);

			///////////////////////////////////////////////////
			while (goReceipt = true) {
				// Present the price, ask for form of payment or to start over
				System.out.println("Your total is:"); // calcPrice()
				System.out.println("Cash (S) \n Credit (T) \n Check (K) \n New Transaction (N) \n");
				// validator
				String continu1 = scan.nextLine();
				if (continu1.equalsIgnoreCase("N")) {
					// reset Shoppingcart array list
					// receipt1.reset();
					newOrder = true;
				} else if (continu1.equalsIgnoreCase("S")) {
					// payment by cash

				} else if (continu1.equalsIgnoreCase("T")) {
					// payment by credit

				} else if (continu1.equalsIgnoreCase("K")) {
					// payment by check

				}
				// based on payment choice calls that payment type method.

				// receipt outputs transaction detail
				// receipt1.Print
				// exits receipt
				goReceipt = false;
			}

			System.out.println("New transaction? (N)");
			// validator
			String continu3 = scan.nextLine();
			if (continu3.equalsIgnoreCase("n")) {
				// reset Shoppingcart array list
				newOrder = true;
			}

		} while (newOrder = true);
		scan.close();
	}

}
