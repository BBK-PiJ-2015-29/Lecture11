public class Employee{
	private String name;
	private String natInsurance;
	
	public Employee(String name, String natInsurance) {
		this.name = name;
		this.natInsurance = natInsurance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNI() {
		return this.natInsurance;
	}
	
	public void setNI(String ni) {
		this.natInsurance = ni;
	}
}