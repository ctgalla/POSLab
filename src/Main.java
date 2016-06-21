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
				        int choice = scan.nextInt();
				        switch(choice) {
				        case 1:
				        	break;
				        case 2:
				        	break;
				        case 3:
				        	break;
				        case 4:
				        	break;
				        case 5:
				        	break;
				        case 6:
				        	break;
				        case 7:
				        	break;
				        case 8:
				        	break;
				        case 9:
				        	break;
				        case 10:
				        	break;
				        case 11:
				        	break;
				        case 12:
				        	break;
			 }
		} 
	}
}

