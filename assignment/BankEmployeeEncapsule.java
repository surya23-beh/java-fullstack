package assignment;
class employee {
	private int id;
	private String name;
	private long salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
		}
	public void setName(String s) {
		this.name = s;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long sal) {
		this.salary = sal;
	}
	}

public class BankEmployeeEncapsule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee();
		e.setName("surya");
		e.setSalary(30000);
		e.setId(2023);
		System.out.println("id is : " + e.getId());
		System.out.println("name is : " + e.getName());
		System.out.println("salary is : "+ e.getSalary());
	
		
	}

}
