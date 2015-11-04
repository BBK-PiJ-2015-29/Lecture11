/**
 * A stack of numbers which represents
 * the call history of a phone.
 * 
 * Implements the NumberStack interface with one extra
 * method: getLength().
 */
public class CallHistory implements NumberStack {
	
	/**
	 * Field which holds a Number to point to the top value
	 * of the stack.
	 *
	 */
	private Number head;
	
	public CallHistory() {
		this.head = null;
	}
	public void push(String newNumber){
		Number input = new Number(newNumber);
		if (head != null) {
			input.setNext(head);
		}
		head = input;
		
	}
	public String pop() {
		if (head == null) {
			return null;
		}
		else {
			String number = head.getNumber();
			head = head.getNext();
			return number;
		}
	}
	public String peek() {
		if (head == null) {
		return null;
	  } 
	  else {
		return head.getNumber();
	  }
	}
	public boolean isEmpty() {
		if (getLength() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Method to return the length of the stack
	 *
	 * @return the length as an int
	 */
	public int getLength() {
		int length = 0;
		Number current = head;
		while (current != null) {
			current = current.getNext();
			length++;
		}
		return length;
	}
}