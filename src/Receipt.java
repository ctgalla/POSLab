
import java.util.ArrayList;

public class Receipt extends Product{

	private static final double SALESTAX = 0.06;
	private ArrayList<Product> itemsOrdered;
	private double subtotal;
	private double tax;
	static double grandTotal;
	private  double quantity;
	private static double price;
	/**
	 * Default constructor
	 */
	public Receipt() {
		super(name, category, price);
		itemsOrdered = new ArrayList<Product>();
	}

	/**
	 * @param itemsOrdered
	 */
	public Receipt(ArrayList<Product> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	/**
	 * @param product
	 */
	public void addProduct(double price, double quantity) {
		this.price = price;
		this.quantity = quantity;
		quantity=getQuantity(quantity);
		subtotal += (price * quantity);
	}

	/**
	 * @param itemsOrdered
	 */
	public void addProducts(ArrayList<Product> itemsOrdered) {
		itemsOrdered.addAll(itemsOrdered);
	}
	
	public double getQuantity(double quantity){
		return quantity;
	}
	
	public  void setQuantity(double q){
		q=quantity;
	}

	
	/**
	 * calculate subtotal tax and grand total and stores values internally user
	 * must call appropriate getter methods to access calculated values
	 */
	private void calcPrice() {
		// calculate subtotal
		for (Product prod : itemsOrdered) {
			subtotal += (prod.getPrice() * getQuantity(quantity));
		}
		// calculate tax
		tax = subtotal * SALESTAX;

		// calculate grand total
		grandTotal = subtotal + tax;
	}

	/**
	 * @return the itemsOrdered
	 */
	public ArrayList<Product> getItemsOrdered() {
		return itemsOrdered;
	}

	/**
	 * @param itemsOrdered
	 *            the itemsOrdered to set
	 */
	public void setItemsOrdered(ArrayList<Product> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		calcPrice();
		return subtotal;
	}

	/**
	 * @param subtotal
	 *            the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the tax
	 */
	public double getTax() {
		calcPrice();
		return tax;
	}

	/**
	 * @param tax
	 *            the tax to set
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}

	/**
	 * @return the grandTotal
	 */
	public double getGrandTotal() {
		calcPrice();
		return grandTotal;
	}

	/**
	 * @param grandTotal
	 *            the grandTotal to set
	 */
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Subtotal: " + subtotal + "\nTax: " + tax +"\nTotal: " + grandTotal;
	}

}
