public interface Cash  {
	Double cashTendered;
	Double cashChange;
	
	public Cash(Double cashTendered){
		
	}
	
	public Double getCashTendered() {
		return this.cashTendered; 
		}

	public void setCashChange(Double cashChange) {
		this.cashChange = cashChange;
	}
	
	public Double calcCashChange(Double cashTendered) {
			cashChange= (cashTendered - Receipt.getGrandTotal());
			return cashChange;
	}
	
	
	public String toString() {
		return "Cash Tendered: " + cashTendered + "\n-Grand Total: " + Receipt.getGrandTotal() +"\nChange: " + cashChange;
	}
}


