
public interface Credit  {
	
	String getCardName();
	void setCardName(String cardName);
	void setCCNumber(long ccNumber);
	long getCCNumber();
	String getExpDate();
	void setExpDate(String expDate);
	short getCVV();
	void setCVV(short cvv);
}
