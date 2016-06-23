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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		//==========================Initiation Section ========================//
		// Scanner
		Scanner scan = new Scanner(System.in);
		// ArrayLists
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<Double> priceList = new ArrayList<Double>();
		ArrayList<Double> quantities = new ArrayList<Double>();
		ArrayList<Product> productList = new ArrayList<Product>();
		DateTimeFormatter exp = new DateTimeFormatterBuilder()
		.appendValue(ChronoField.MONTH_OF_YEAR, 2)
		.appendLiteral('/')
		.appendValueReduced(ChronoField.YEAR, 2, 2, 1980)
		.toFormatter();
		
		@SuppressWarnings("unused")
		DateTimeFormatter timeStamp = new DateTimeFormatterBuilder()
		.appendValue(ChronoField.MONTH_OF_YEAR, 2)
		.appendLiteral('/')
		.appendValue(ChronoField.DAY_OF_MONTH, 2)
		.appendLiteral('/')
		.appendValueReduced(ChronoField.YEAR, 2, 2, 1980)
		.appendLiteral(" ")
		.appendValue(ChronoField.HOUR_OF_DAY, 2)
		.appendLiteral(':')
		.appendValue(ChronoField.MINUTE_OF_HOUR, 2)
		.appendLiteral(':')
		.appendValue(ChronoField.SECOND_OF_MINUTE, 2)
		.toFormatter();
		LocalDate currentTime = LocalDate.now();
		// LocalDate currentFormattedTime = LocalDate.parse(currentTime, timeStamp);
		
		// Receipt Object initiated
		Receipt receipt = new Receipt();

		// Recursive boolean variables initiated
		boolean newOrder = false;
		boolean goReceipt = false;
		boolean plusProduct = true;
		//==========================File to ArrayList==========================//
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
				
				
				System.out.println("==============Choices==============");
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
				System.out.print("Select a product by entering the values 1 - 12: ");
				int choice = scan.nextInt();
				if (choice > 12 || choice != (int) choice) {
					System.out
							.print("You entered an invalid value! Please choose a number between 1 - 12: ");
					choice = scan.nextInt();
				}
				//=======================Choices=====================//
				switch (choice) {
				case 1:
					System.out.println("You have chosen " + productList.get(0).getName() + " for: $"
										+ productList.get(0).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(0).getName());
					priceList.add(productList.get(0).getPrice());
					@SuppressWarnings("unused")
					String garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					double quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 2:
					System.out.println("You have chosen " + productList.get(1).getName() + " for: $"
							+ productList.get(1).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(1).getName());
					priceList.add(productList.get(1).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 3:
					System.out.println("You have chosen " + productList.get(2)+ " for: $"
							+ productList.get(2).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(2).getName());
					priceList.add(productList.get(2).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 4:
					System.out.println("You have chosen " + productList.get(3)+ " for: $"
							+ productList.get(3).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(3).getName());
					priceList.add(productList.get(3).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 5:
					System.out.println("You have chosen " + productList.get(4)+ " for: $"
							+ productList.get(4).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(4).getName());
					priceList.add(productList.get(4).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 6:
					System.out.println("You have chosen " + productList.get(5)+ " for: $"
							+ productList.get(5).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(5).getName());
					priceList.add(productList.get(5).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 7:
					System.out.println("You have chosen " + productList.get(6)+ " for: $"
							+ productList.get(6).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(6).getName());
					priceList.add(productList.get(6).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 8:
					System.out.println("You have chosen " + productList.get(7)+ " for: $"
							+ productList.get(7).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(7).getName());
					priceList.add(productList.get(7).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 9:
					System.out.println("You have chosen " + productList.get(8)+ " for: $"
							+ productList.get(8).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(8).getName());
					priceList.add(productList.get(8).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 10:
					System.out.println("You have chosen " + productList.get(9)+ " for: $"
							+ productList.get(9).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(9).getName());
					priceList.add(productList.get(9).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 11:
					System.out
							.println("You have chosen " + productList.get(10)+ " for: $"
									+ productList.get(10).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(10).getName());
					priceList.add(productList.get(10).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				case 12:
					System.out
							.println("You have chosen " + productList.get(11)+ " for: $"
									+ productList.get(11).getPrice());
					// Add to shopping cart here!!
					nameList.add(productList.get(11).getName());
					priceList.add(productList.get(11).getPrice());
					garbage = scan.nextLine();
					System.out.print("Please choose a quantity: ");
					quantity = scan.nextDouble();
					quantities.add(quantity);
					break;
				}
				
				for (String n : nameList) {
					System.out.println(n);
				}
				
				for (double x : priceList) {
					System.out.println(x);
				}
				
				for (double q : quantities) {
					System.out.println(q);
				}
				//=========================Recursion Process=========================//
				// Ask to chose another product or checkout or new transaction
				System.out.println("New transaction? (N) \n Another product?(P) \n Checkout (C)");

				// add Validator
				String continu = scan.next();
				if (continu.equalsIgnoreCase("N")) {
					// reset ArrayLists
					priceList.clear();
					nameList.clear();
					quantities.clear();
					newOrder = true;
				} else if (continu.equalsIgnoreCase("P")) {
					//Runs looping process
					plusProduct = true;
				} else if (continu.equalsIgnoreCase("C")) {
					//Continues code
					plusProduct = false;
					goReceipt = true;
				}
			}
			//===========================CheckOut Process===========================//
			while (goReceipt == true) {
				// Present the price, ask for form of payment or to start over
				double subtotal = receipt.calcSubTotal(priceList, quantities);
				double tax = receipt.calcTax(subtotal);
				double total = receipt.calcTotal(subtotal, tax);
				double roundedTotal = receipt.round(total, 2);
				@SuppressWarnings("unused")
				String garbage = scan.nextLine();
				/*
				 * ============Attempt to make a secondary payment option.
					int occurance = 0;
					occurance++;
					if (occurance > 1) {
						roundedTotal = receipt.setTotal(roundedTotal);
						roundedTotal = roundedTotal - differentAmount;
				}
				
				*/
				System.out.println("Your total is: $" + roundedTotal);
				System.out.println("1. Cash\n2. Credit\n3. Check\n4.0. New Transaction");
				System.out.print("Choose a method of payment (0-3): ");
				int continu1 = scan.nextInt();
				boolean receiptActive = true;
				// Validation
				while (receiptActive)
				switch(continu1) {
				case 1:
					// payment by cash
					garbage = scan.nextLine();
					System.out.print("Enter the cash amount: $");
					double cashAmount = scan.nextDouble();
					double differentAmount = total - cashAmount;
					double roundedDiffAmount = receipt.round(differentAmount, 2);
					if (cashAmount == roundedTotal) {
						System.out.println("=========================Receipt=========================");;
						System.out.println("\t\t\t\t\t\t" + currentTime);
						System.out.println("   Item" + "\t\t\t" + "   Price" + "\t\t" + " Quantity");
						System.out.println("==========" + "\t\t" + "==========" + "\t\t" + "==========" + "\t\t");
						for (int i = 0; i < priceList.size(); i++) {
							System.out.println(nameList.get(i) + "\t\t\t  " + priceList.get(i) + "\t\t\t  " + quantities.get(i));
						}
						priceList.clear();
						quantities.clear();
						System.out.println("Thank you, have a nice day!");
						newOrder = true;
						receiptActive = false;
						break;
						} else {
							System.out.print("You have not given the proper amount! Please pay the difference of  $" + roundedDiffAmount/*+ "\n or enter 0 to pay the difference with a separate method: */);
							double diffAmount = scan.nextDouble();
							if (diffAmount != differentAmount) {
								priceList.clear();
								quantities.clear();
								//receipt.setDiffTotal(differentAmount);
								break;
							}
						}
				case 2:
					//Payment by card
					System.out.println("Enter credit card information: ");
					System.out.print("Enter the name on the Credit Card: ");
					String cardName = scan.nextLine();
					receipt.setCardName(cardName);
					System.out.print("Enter the Credit Card #: "); //Need to make a loop to X out Credit Info on receipt
					long creditCardNumber = scan.nextLong();
					receipt.setCCNumber(creditCardNumber);
					garbage = scan.nextLine();
					System.out.print("Enter the expiration date (Format: MM/YY): ");
					String date1 = scan.nextLine();
					LocalDate expDate = LocalDate.parse(date1, exp);
					receipt.setExpDate(expDate);
					
					System.out.println("=========================Receipt=========================");;
					System.out.println("\t\t\t\t\t\t" + currentTime);
					System.out.println("   Item" + "\t\t\t" + "   Price" + "\t\t" + " Quantity");
					System.out.println("==========" + "\t\t" + "==========" + "\t\t" + "==========" + "\t\t");
					for (int i = 0; i < priceList.size(); i++) {
						System.out.println(nameList.get(i) + priceList.get(i) + quantities.get(i));
					}
					receiptActive = false;
					newOrder = true;
					break;
				case 3:
					// payment by check
					
					System.out.println("Enter check number: ");
					String checkNumber = scan.nextLine();
					System.out.println("=========================Receipt=========================");;
					System.out.println("\t\t\t\t\t\t" + currentTime);
					System.out.println("   Item" + "\t\t\t" + "   Price" + "\t\t" + " Quantity");
					System.out.println("==========" + "\t\t" + "==========" + "\t\t" + "==========" + "\t\t");
					for (int i = 0; i < priceList.size(); i++) {
						System.out.println(nameList.get(i) + priceList.get(i) + quantities.get(i));
					}
					System.out.println("Check Number: " + checkNumber);
					newOrder = true;
					receiptActive = false;
					break;
				case 0:
					priceList.clear();
					nameList.clear();
					quantities.clear();
					newOrder = true;
					plusProduct = false;
					receiptActive = false;
				default:
					goReceipt = true;
					System.out.println("Please enter a valid payment method: ");
					break;
				}
				
				// based on payment choice calls that payment type method.

				// receipt outputs transaction detail
				// receipt1.Print
				// exits receipt
			}

		//Program Recursion Step
		}while (newOrder);
		scan.close();
	}
}