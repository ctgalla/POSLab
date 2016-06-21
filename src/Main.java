import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
				Path productsPath = Paths.get("./products.csv");
				File productsFile = productsPath.toFile();
				
				ArrayList<Product> productList = new ArrayList<Product> ();
				
				try {            
				    FileReader r = new FileReader(productsFile);
				    BufferedReader in = new BufferedReader( r);
				    String line = in.readLine();
			    		while (line !=null)
			    		{
			        		String[] details = line.split("\t");
			        		
			        		Product temp = new Product(details[0], details[1], details[2], details[3]);
			        		productList.add(temp);
			        		
			        		line = in.readLine();
			    		}

			    		in.close();
				 }  catch (IOException e) {
				        System.out.println(e); 
				 } 
				
				//output everything
				for (Product p: productList) {
					System.out.println(p);
				}
				
				System.out.println("Produce only:");
				
				//one category
				for (Product p: productList) {
					if (p.getCategory().equals("Produce"))
						System.out.println(p);
				}

	}
}
