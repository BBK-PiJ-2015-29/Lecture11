/**
 * A class to be held in a list
 * Lecture 11
 * @author ocouls01
 */
public class Employee{
	private String name;
	private String natInsurance;
	
	public Employee(String name, String natInsurance) {
		this.name = name;
		this.natInsurance = natInsurance;
	}
	/**
	 * Accessor method for the name field
	 * @return the name of the Employee as a String
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Mutator method for the name field
	 * @param name the new name of the Employee
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Accessor method for the natInsurance field
	 * @return the Employee's natInsurance number as a String.
	 */
	public String getNI() {
		return this.natInsurance;
	}
	
	/**
	 * Mutator method for the natInsurance field
	 * @param ni the new natInsurance as a String
	 */
	public void setNI(String ni) {
		this.natInsurance = ni;
	}
}