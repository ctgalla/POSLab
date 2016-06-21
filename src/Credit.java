import java.text.SimpleDateFormat;

public class Credit extends PaymentType {
	String name;
	long ccNumber;
	String  expDate;
	short cVV;
	

public Credit(String name, long ccNumber, String expDate,short cVV) {
    this.name = name;
    this.ccNumber = ccNumber;
    this.expDate = expDate;
    this.cVV = cVV;
	}

	public String getName() { return this.name; }
	public long getccNumber() { return this.ccNumber; }
	public String getExpDate() { return this.expDate; }
	public int getCVV() { return this.cVV; }
	
	
	
//	
//	super.paymentInfo=;
	
}
