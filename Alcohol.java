
public class Alcohol extends Beverage {
private final double WEEKEND_FEE = 0.60;
private boolean isWeekend;

public Alcohol(String str, SIZE sz, boolean weekend ) {
	super(str,TYPE.ALCOHOL, sz);
	isWeekend = weekend; 
}

public boolean getIsWeekend() {
	return isWeekend;
}
public double getWeekendFee() {
	return WEEKEND_FEE;
}


public void setIsWeekend(boolean is_wkn) {
	isWeekend = is_wkn;
}


public String toString() {
	String str = "Drink " + getBevName() + " "+getSize();
	if (isWeekend ==  true) {
		str = str + " weekend pricing";
	}
	 str = str + ", $" + calcPrice();
	 return str;
}
	
public boolean equals (Alcohol a)	{
	if (super.equals(a) && isWeekend == a.getIsWeekend()) {
		return true;
	} else return false;
}
	
	
	public double calcPrice() {
		double price = super.getBasePrice();

		if (super.getSize() == SIZE.MEDIUM) {
		price += super.getSizePrice();
		}
		else if (super.getSize() == SIZE.LARGE) {
		price += 2 * super.getSizePrice();
		}

		if (isWeekend == true) {
		price += WEEKEND_FEE;
		}
		return price;
}

}






