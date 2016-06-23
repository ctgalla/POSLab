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
		// Scanner
		Scanner scan = new Scanner(System.in);
		// ArrayLists
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<Double> priceList = new ArrayList<Double>();
		ArrayList<Double> quantities = new ArrayList<Double>();
		ArrayList<Product> productList = new ArrayList<Product>();

		// Receipt Object initiated
		Receipt receipt = new Receipt();

		// Recursive boolean variables initiated
		boolean newOrder = false;
		boolean goReceipt = false;
		boolean plusProduct = true;

		// File in Project Folder given a variable address and then plugged into
		// our productList ArrayList
		// temporarily for the life-span of the programs use.
		Path productsPath = Paths.get("products.csv");
		File productsFile = productsPath.toFile();
		try {
			FileReader r = new FileReader(productsFile);
			BufferedReader in = new BufferedReader(r);
			String line = in.readLine();
			while (line != null) {
				String[] details = line.split(",");
				Product temp = new Product(details[0], details[1], details[2],
						details[3]);
				productList.add(temp);

				line = in.readLine();
			}

			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		// Do/While loop for a complete transaction cycle
		do {

			// Recursive loop for shopping cart/receipt
			while (plusProduct == true) {

				// Present Menu from ArrayList- Products
				int choiceCount = 0;
				// Contingency for choiceCount to reset it's value.
				if (choiceCount > 12) {
					choiceCount = 0;
				} else {
					// Enhanced Loop to display the index of productList
					for (Product p : productList) {
						choiceCount++;
						System.out.println(choiceCount + ": " + p);
					}
				}

				System.out
						.print("Select a product by entering the values 1 - 12: ");

				int choice = scan.nextInt();
				if (choice > 12 || choice != (int) choice) {
					System.out
							.print("You entered an invalid value! Please choose a number between 1 - 12: ");
					choice = scan.nextInt();
				}
				switch (choice) {
				case 1:
					System.out.println("You have chosen "
							+ productList.get(0).getName() + " for: $"
							+ productList.get(0).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(0).getName());
					priceList.add(productList.get(0).getPrice());
					String garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					double quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 2:
					System.out.println("You have chosen " + productList.get(1));
					// Add to shopping cart here!!
					nameList.add(productList.get(1).getName());
					priceList.add(productList.get(1).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 3:
					System.out.println("You have chosen " + productList.get(2));
					// Add to shopping cart here!!
					nameList.add(productList.get(2).getName());
					priceList.add(productList.get(2).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 4:
					System.out.println("You have chosen " + productList.get(3));
					// Add to shopping cart here!!
					nameList.add(productList.get(3).getName());
					priceList.add(productList.get(3).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 5:
					System.out.println("You have chosen " + productList.get(4));
					// Add to shopping cart here!!
					nameList.add(productList.get(4).getName());
					priceList.add(productList.get(4).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 6:
					System.out.println("You have chosen " + productList.get(5));
					// Add to shopping cart here!!
					nameList.add(productList.get(5).getName());
					priceList.add(productList.get(5).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 7:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(6));
					// Add to shopping cart here!!
					nameList.add(productList.get(6).getName());
					priceList.add(productList.get(6).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 8:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(7));
					// Add to shopping cart here!!
					nameList.add(productList.get(7).getName());
					priceList.add(productList.get(7).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 9:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(8));
					// Add to shopping cart here!!
					nameList.add(productList.get(8).getName());
					priceList.add(productList.get(8).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 10:
					garbage = scan.nextLine();
					System.out.println("You have chosen " + productList.get(9));
					// Add to shopping cart here!!
					nameList.add(productList.get(9).getName());
					priceList.add(productList.get(9).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 11:
					garbage = scan.nextLine();
					System.out
							.println("You have chosen " + productList.get(10));
					// Add to shopping cart here!!
					nameList.add(productList.get(10).getName());
					priceList.add(productList.get(10).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				case 12:
					garbage = scan.nextLine();
					System.out
							.println("You have chosen " + productList.get(11));
					// Add to shopping cart here!!
					nameList.add(productList.get(11).getName());
					priceList.add(productList.get(11).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;

				}

				// Ask to chose another product or checkout or new transaction
				System.out
						.println("New transaction? (N) \n Another product?(P) \n Checkout (C)");

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
			// /////////////////////////////////////////////////
			while (goReceipt == true) {
				// Present the price, ask for form of payment or to start over
				System.out.println("Your total is:"); // calcPrice()
				System.out
						.println("Cash (S) \n Credit (T) \n Check (K) \n New Transaction (N) \n");
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
