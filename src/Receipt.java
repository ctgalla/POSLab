
import java.util.ArrayList;

public class Receipt {

	private static final double SALESTAX = 0.06;
	private ArrayList<Product> itemsOrdered;
	private double subtotal;
	private double tax;
	private double grandTotal;

	/**
	 * Default constructor
	 */
	public Receipt() {
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
	public void addProduct(Product product) {
		itemsOrdered.add(product);

	}

	/**
	 * @param itemsOrdered
	 */
	public void addProducts(ArrayList<Product> itemsOrdered) {
		itemsOrdered.addAll(itemsOrdered);
	}

	/**
	 * calculate subtotal tax and grand total and stores values internally user
	 * must call appropriate getter methods to access calculated values
	 */
	private void calcPrice() {
		// calculate subtotal
		for (Product prod : itemsOrdered) {
			subtotal = subtotal + (prod.getPrice() * prod.getQuantity());
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
		// TODO Auto-generated method stub
		return "Subtotal: " + subtotal + "\nTax: " + tax +"\nTotal: " + grandTotal;
	}

}
