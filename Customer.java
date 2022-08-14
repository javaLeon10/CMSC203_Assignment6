
public class Customer {
	private String name;
	private int age;
	

	public Customer(String nam, int ag) {
		name = nam;
		age = ag;
	}
	
	public Customer(Customer cust) {
		name = cust.getName();
		age = cust.getAge();
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	
	
	public String toString() {
		return "Customer "+ name +", " +age +"years";
	}
	
	
}
