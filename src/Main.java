
//Kaitlin, Chelsea, Brandon
//Grand Circus Bootcamp
//Midterm Project- POINT OF SALE
// This is a point of sale app for an employee-manned cash register.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean newOrder = false;
		boolean goReceipt = false;
		boolean plusProduct = true;
		Receipt receipt = new Receipt();

		Path productsPath = Paths.get("products.csv");
		File productsFile = productsPath.toFile();
		ArrayList<Product> productList = new ArrayList<Product>();

		try {
			FileReader r = new FileReader(productsFile);
			BufferedReader in = new BufferedReader(r);
			String line = in.readLine();
			while (line != null) {
				String[] details = line.split(",");
				Product temp = new Product(details[0], details[1], details[2], details[3]);
				productList.add(temp);

				line = in.readLine();
			}

			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		// loop for a complete transaction cycle
		do {

			// loop for shopping cart/receipt
			while (plusProduct == true) {

				// Present Menu from ArrayList- Products

				System.out.print("Make your choice by selecting a number from 1 - 12: ");
				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					String garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(0));
					// Add to shopping cart here!!
					garbage =scan.nextLine();
					System.out.print("Quantity: ");
					double quantity=scan.nextInt();
					receipt.getQuantity(quantity);
					receipt.addProduct(productList.getPrice(0));
					

					break;

				case 2:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(1));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(1));
					

					break;
				case 3:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(2));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(2));
					

					break;
				case 4:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(3));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(3));
					
					break;
				case 5:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(4));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(4));
					
					break;
				case 6:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(5));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(5));
					
					break;
				case 7:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(6));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(6));
					
					break;
				case 8:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(7));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(7));
				
					break;
				case 9:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(8));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(8));
					
					break;
				case 10:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(9));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(9));
				
					break;
				case 11:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(10));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(10));
					
					break;
				case 12:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(11));
					// Add to shopping cart here!!
					receipt.addProduct(productList.get(11));
				
					break;
				}
			

			// Ask to chose another product or checkout or new transaction
			System.out.println("New transaction? (N) \n Another product?(P) \n Checkout (C)");

			// add Validator
			String continu = scan.next();
			if (continu.equalsIgnoreCase("N")) {
				// reset receipt array list
				// receipt.reset()
				newOrder = true;
			} else if (continu.equalsIgnoreCase("P")) {
				// build arraylist in receipt and save
				plusProduct = true;
			} else if (continu.equalsIgnoreCase("C")) {
				plusProduct = false;
				goReceipt = true;
			}
		}
			///////////////////////////////////////////////////
			while (goReceipt == true) {
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

		} while (newOrder == true);
		scan.close();
	}

}
