	
	import java.util.ArrayList;
	import java.util.Random;

	// OrderInterface isWeekend Issue
	public class Order implements OrderInterface, Comparable<Order> {
		private int orderNo;
		private int orderTime;
		private DAY orderDay;
		private Customer customer;
		private ArrayList<Beverage> beverages;
		
		
		public Order(int tim, DAY da, Customer cust) {
			orderNo = generateOrderNum();
			orderTime = tim;
			orderDay = da;
			customer = cust;
			beverages = new ArrayList<>();
		}
		
		public int getOrderNo() {
			return orderNo;
		}
		public int getOrderTime() {
			return orderTime;
		}
		public DAY getOrderDay() {
			return orderDay;
		}
		public Customer getCustomer() {
			return new Customer(customer);
		}
		public ArrayList<Beverage> getBeverages() {
			return beverages;
		}
		
		
		public void setOrderNum(int order_num) {
			orderNo = order_num;
		}
		public void setOrderTime(int order_time) {
			orderTime = order_time;
		}
		public void setOrderDay(DAY order_day) {
			orderDay = order_day;
		}
		public void setCustomer(Customer cust) {
			customer = cust;
		}
		
	
		public int generateOrderNum() {
			Random rand = new Random();
			int randnum = rand.nextInt(80000)+10000;
			return randnum;
		}
		
		public String toString() {
			
			String s = "Order " +orderNo +" " + orderDay +" " +orderTime +"  "+customer +"\n";
			
			for (Beverage b : beverages) {
				s += "\n" +b.toString();
			}
			s += "\n Total on the order: " +calcOrderTotal();
			
			return s;
		}
		
		public boolean isWeekend() {
			if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
				return true;
			}
			return false;
		}
		
		public Beverage getBeverage(int itemNum) {
			return beverages.get(itemNum);
		}
		public int compareTo(Order o) {
			if (orderNo == o.getOrderNo()) {
				return 0;
			}
			else if (orderNo > o.getOrderNo()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		public double calcOrderTotal() {
			double orderTotal = 0;
			
			for (Beverage b : beverages) {
				orderTotal += b.calcPrice();
			}
			
			return orderTotal;
		}
		public int findNumOfBeveType(TYPE type) {
			int count = 0;
			
			for (Beverage b : beverages) {
				if (b.getType() == type) {
					count++;
				}
			}
			
			return count;
		}
		public int getTotalItems() {
			return beverages.size();
		}
		
		
		public void addNewBeverage(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
			Coffee c = new Coffee(name, size, extraShot, extraSyrup);
			beverages.add(c);
		}
		public void addNewBeverage(String name, SIZE size, int numOfFruits, boolean protein) {
			Smoothie s = new Smoothie(name, size, numOfFruits, protein);
			beverages.add(s);
		}
		public void addNewBeverage(String name, SIZE size) {
			boolean isWeekend = false;
			if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
				isWeekend = true;
			}
			
			Alcohol a = new Alcohol(name, size, isWeekend);
			beverages.add(a);
		}
		
		
	}

