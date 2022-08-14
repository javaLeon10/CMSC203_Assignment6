

	public class Smoothie extends Beverage{
		private int numOfFruits;
		private boolean addProtein;
		private final double FRUIT_COST = 0.5;
		private final double PROTEIN_COST = 1.5;
		
		
		public Smoothie(String str, SIZE sz, int num_frt, boolean add_prot) {
			super(str, TYPE.SMOOTHIE, sz);
			numOfFruits = num_frt;
			addProtein = add_prot;
		}
		
		public int getNumOfFruits() {
			return numOfFruits;
		}
		public boolean getAddProtein() {
			return addProtein;
		}
		public double getFruitCost() {
			return FRUIT_COST;
		}
		public double getProteinCost() {
			return PROTEIN_COST;
		}
		
		
		public void setNumOfFruits(int num_frt) {
			numOfFruits = num_frt;
		}
		public void setProteinPowder(boolean add_prot) {
			addProtein = add_prot;
		}
		
		
		public String toString() {
			String s = "Smoothie "+getBevName() +", " +getSize() +" " +numOfFruits +" Fruits";
			
			if (addProtein==true) {
				s += " Protein";
			}
			
			s += ", $" +calcPrice();
			
			return s;
		}
		public boolean equals(Smoothie s) {
			if (super.equals(s) && numOfFruits==s.getNumOfFruits() && addProtein==s.getAddProtein()) {
				return true;
			}
			else {
				return false;
			}
		}
		public double calcPrice() {
			double price = super.getBasePrice();
			
			if (super.getSize() == SIZE.MEDIUM) {
				price += super.getSizePrice();
			}
			else if (super.getSize() == SIZE.LARGE) {
				price += 2 * super.getSizePrice();
			}
			
			price += numOfFruits * FRUIT_COST;
			
			if (addProtein == true) {
				price += PROTEIN_COST;
			}
			
			return price;
		}
		
		
	}

