
public class Coffee extends Beverage{
		private boolean extraShot;
		private boolean extraSyrup;
		private final double SHOT_COST = 0.5;
		private final double SYRUP_COST = 0.5;
		
		
		public Coffee(String str, SIZE sz, boolean if_shot, boolean if_syrup) {
			super(str, TYPE.COFFEE, sz);
			extraShot = if_shot;
			extraSyrup = if_syrup;
		}
		
		
		public boolean getExtraShot() {
			return extraShot;
		}
		public boolean getExtraSyrup() {
			return extraSyrup;
		}
		public double getShotCost() {
			return SHOT_COST;
		}
		public double getSyrupCost() {
			return SYRUP_COST;
		}
		
		
		public void setExtraShot(boolean if_shot) {
			extraShot = if_shot;
		}
		public void setExtraSyrup(boolean if_syrup) {
			extraSyrup = if_syrup;
		}
		
		public String toString() {
			String str = "Coffee "+getBevName() +", " +getSize();
			
			if (extraShot==true) {
				str += " Extra shot";
			}
			if (extraSyrup==true) {
				str += " Extra syrup";
			}
			
			str += ", $" +calcPrice();
			
			return str;
		}
		public double calcPrice() {
			double price = super.getBasePrice();
			
			if (super.getSize() == SIZE.MEDIUM) {
				price += super.getSizePrice();
			}
			else if (super.getSize() == SIZE.LARGE) {
				price += 2 * super.getSizePrice();
			}
			
			if (extraShot == true) {
				price += SHOT_COST;
			}
			if (extraSyrup == true) {
				price += SYRUP_COST;
			}
			
			return price;
		}
		public boolean equals(Coffee c) {
			if (super.equals(c) && extraShot==c.getExtraShot() && extraSyrup==c.getExtraSyrup()) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
	}

