import java.time.LocalDate;


public interface Credit  {
	
	String getCardName();
	void setCardName(String cardName);
	void setCCNumber(long ccNumber);
	long getCCNumber();
	void setExpDate(LocalDate expDate);
	short getCVV();
	void setCVV(short cvv);
}
