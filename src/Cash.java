import java.math.BigDecimal;

public class Cash extends PaymentType {
	BigDecimal cashTendered;
	BigDecimal cashChange;
	
	public Cash(BigDecimal cashTendered){
		
	}
	
	public BigDecimal getCashTendered() {
		return this.cashTendered; 
		}

	public void setCashChange(BigDecimal cashChange) {
		this.cashChange = cashChange;
	}
	
	//public BigDecimal calcCashChange(BigDecimal cashTendered, calcPrice) {
	//		cashChange= (cashTendered - calcPrice)
	
	
}
