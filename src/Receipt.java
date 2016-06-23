import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;


public class Receipt implements Cash, Credit, Check {
	public static void main(String[] args) {
		
	}
	//Tax variables
	private double tax;
	final double SALESTAX = .06;
	
	//Total variables
	private double subtotal;
	private double total;
	private double grandTotal;
	private static double x;
	
	//Cash variables
	private double cashTendered;
	private double cashChange;
	
	//Credit variables 
	private String cardName;
	private long ccNumber;
	private LocalDate expDate;
	private short cvv;
	
	//Check variable
	private String checkNumber;
	private ArrayList<Double> quantities;
	private ArrayList<Double> priceList;
	
	//====================Cash Methods============================//
	@Override
	public double getCashTendered() {
		return cashTendered;
		
	}

	@Override
	public double setCashTendered(double cashTendered){
		return cashTendered; 
	}
	//====================Credit Methods==========================//
	public String getCardName() {
		return cardName;
		
	}
	@Override
	public void setCardName(String cardName) { 
		this.cardName = cardName;
	}

	@Override
	public void setCCNumber(long ccNumber) { 
		this.ccNumber = ccNumber; 
		}

	@Override
	public long getCCNumber() {
		return ccNumber;
	}

	
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public short getCVV() {
		return cvv;
	}
	@Override
	public void setCVV(short cvv) {
		this.cvv = cvv;
		
	}
	//====================Check Methods===========================//
	
	@Override
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	@Override
	public String getCheckNumber() {
		return checkNumber;
	}
	//====================ArrayList Methods=======================//
	public void setPriceList(ArrayList<Double> priceList) {
		this.priceList = priceList;
	}
	
	public ArrayList<Double> getPriceList() {
		return priceList;
	}
	
	public void setQuantities(ArrayList<Double> quantities) {
		this.quantities = quantities;
	}
	
	public ArrayList<Double> getQuantities(ArrayList<Double> quantities) {
		return quantities;
	}
	//====================Calculation Methods=====================//
	public double getSubtotal() {
		return subtotal;
	}
	
	public double calcSubTotal(ArrayList<Double> priceList, ArrayList<Double> quantities) {
		for (int x = 0; x < priceList.size(); x++)
		subtotal += priceList.get(x) * quantities.get(x);
		return subtotal;
	}
	
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	public double calcTax(double subtotal) {
		this.subtotal = subtotal;
		double tax = subtotal * SALESTAX;
		return tax;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double calcTotal(double subtotal, double tax) {
		double total = tax + subtotal;
		return total;
	}
	public double getTotal() {
		return total;
	}
//	
//	public void setDiffTotal(double roundedDiffAmount) {
//		x = roundedDiffAmount;
//	}
//	
//	public double getDiffTotal() {
//		return x;
//	}
//	
	public double round(double x, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(x);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	//~~~~~~~~~~~~~~~~~~~~Cash Calculation Methods~~~~~~~~~~~~~~~~//
	
	@Override
	public void getCashChange(double cashChange){
		this.cashChange = cashChange;
	}

	@Override
	public double setCashChange() {
		return cashChange;
	}
	
	@Override
	public String calcCashChange(double cashTendered, double total) {
		this.total = total;
		this.cashTendered = cashTendered;
		double cashChange = cashTendered - total;
		
		return "Cash Tendered: " + cashTendered + "\n-Total: " + total +"\nChange: " + cashChange;
	}
	//====================Reporting Method=======================//
	
	@Override
	public String toString() {
		return "Subtotal: " + subtotal + "\nTax: " + tax +"\nTotal: " + grandTotal;
	}
}