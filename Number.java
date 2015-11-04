/**
 * A holder class which holds a String number (phone number),
 * which is to be held in a list.
 */
public class Number{
	/**
	 * Fields to hold the String number and a pointer to the next 
	 * in the list.
	 */
	private String number;
	private Number next;
	
	/**
	 * Constructor method, sets the next pointer initially to null.
	 * 
	 * @param number the phone number to be held in the object
	 */
	public Number(String number) {
		this.number = number;
		this.next = null;
		
	}
	
	/**
	 * Adds a new Number object to the list
	 *
	 * @param number the number to be added.
	 */
	public void addNumber(String number) {
		if (this.next == null) {
			this.next = new Number(number);
		}
		else {
			this.next.addNumber(number);
		}
	}
	
	/**
	 * Method which returns the number of Numbers in the list
	 *
	 * @return the number of Numbers in the list.
	 */
	public int countNumbers() {
		int count = 0;
		if (this.next == null) {
			count++;
			return count;
		}
		else {
			count++;
			count += this.next.countNumbers();
			return count;
		}
	}
	
	/**
	 * Getter/accessor method for number field
	 *
	 * @return the number as a String
	 */
	
	public String getNumber() {
		return this.number;
	}
	
	/**
	 * Getter/accessor method for next pointer field
	 *
	 * @return the pointer as a Number object
	 */
	 
	public Number getNext() {
		return this.next;
	}
	
	/**
	 * Setter/mutator method for next field
	 *
	 * @param next the pointer to the next Number
	 */
	public void setNext(Number next) {
		this.next = next;
	}
}