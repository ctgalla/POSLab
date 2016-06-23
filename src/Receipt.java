
public class Receipt implements Cash, Credit, Check {
	
	//Tax variables
	private double tax;
	final double SALESTAX = 0.06;
	
	//Total variables
	private double subtotal;
	private double total;
	private double grandTotal;
	
	//Cash variables
	private double cashTendered;
	private double cashChange;
	
	//Credit variables 
	private String cardName;
	private long ccNumber;
	private String expDate;
	private short cvv;
	
	//Check variable
	private String checkNumber;
	
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

	@Override
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String getExpDate() {
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
	//====================Calculation Methods=====================//
	/*
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
	*/
	public double getSubtotal() {
		//calcPrice();
		return subtotal;
	}
	
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	public double getTax() {
		//calcPrice();
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getGrandTotal() {
		//calcPrice();
		return grandTotal;
	}
	
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
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