/**
 * This class represents old, pre-digital phones.
 *
 * 
 */
public class OldPhone implements Phone {
	/**
	 * One member field holding the brand of the phone
	 *
	 */
	private String brand = null;
	
	/**
	 * Constructor method must be 
	 *
	 * @param brand a String representing the brand of the phone
	 */
	public OldPhone(String brand) {
		this.brand = brand;
	}
	
	/**
	 * Accessor method for the brand field.
	 *
	 * @return the brand of the phone as a String
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * Method will call a number
	 * @param number is the number to be called
	 */
	public void call(String number) {
		System.out.println("Calling " + number);
	}
	
	
}