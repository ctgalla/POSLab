import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
				
				Path productsPath = Paths.get("products.csv");
				File productsFile = productsPath.toFile();
				ArrayList<Product> productList = new ArrayList<Product> ();
				
				try {            
				    FileReader r = new FileReader(productsFile);
				    BufferedReader in = new BufferedReader(r);
				    String line = in.readLine();
			    		while (line !=null)
			    		{
			        		String[] details = line.split(",");
			        		Product temp = new Product(details[0], details[1], details[2], details[3]);
			        		productList.add(temp);
			        		
			        		line = in.readLine();
			    		}

			    		in.close();
				 }  catch (IOException e) {
				        System.out.println(e); 
			 }
				boolean done = false;
				while (!done) {
				int timesLooped = 0;
				int choiceCounter = 0;
				if (timesLooped < 0) {
					System.out.println("What can I make for you today?\n");
					timesLooped++;
			        for (Product p: productList) {
			        	choiceCounter++;
						System.out.println(choiceCounter + ": " + p);//implicit call to toString();
					}
				} else {
					System.out.println("What else can I get for you, today?\n");
					timesLooped++;
			        for (Product p: productList) {
			        	choiceCounter++;
						System.out.println(choiceCounter + ": " + p);//implicit call to toString();
					}
				}
		        System.out.print("Make your choice by selecting a number from 1 - 12: ");
		        int choice = scan.nextInt();
		        
		        switch(choice) {
		        case 1:
		        	String garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(0));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	String continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        	
		        case 2:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(1));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 3:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(2));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	}
		        	break;
		        case 4:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(3));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 5:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(4));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 6:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(5));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 7:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(6));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 8:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(7));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 9:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(8));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 10:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(9));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 11:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(10));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        		done = true;
		        	} 
		        	break;
		        case 12:
		        	garbage = scan.nextLine();
		        	System.out.println("You have chosen " + productList.get(11));
		        	//Add to shopping cart here!!
		        	System.out.println("Will that be all for you today? (Please enter Yes(Y) or No(N))");
		        	
		        	continueAnswer = scan.nextLine();
		        	if (Character.toLowerCase(continueAnswer.charAt(0)) == ('y')) {
		        		//Implement Checkout
		        		//add to bill
		        		//code here
		        	done = true;
		        	break;
		        	}
		     } 
	     }      
				scan.close();
	} 
}


