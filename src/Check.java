
public interface Check {
	String checkNumber;
	
		public Check (String checkNumber){
			this.checkNumber= checkNumber;
		}

		public String getCheckNumber() {
			return checkNumber;	
		}
	
	
		public String toString() {
			return "Check: " + checkNumber +"\nCheck Amount:" + Receipt.getGrandTotal();
		}
}
