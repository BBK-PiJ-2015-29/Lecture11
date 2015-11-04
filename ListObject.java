/**
 * A class to function as a node in a doubly linked list.
 * The class is generic and can hold any type of object in
 * the contents field.
 * PiJ Lecture 11
 * @author ocouls01
 */
public class ListObject<T> {
	/**
	 * The fields include the generic object to be held
	 * and two pointers to the next and previous ListObject
	 */
	private T contents;
	private ListObject<T> next;
	private ListObject<T> prev;
	
	/**
	 * The object must be constructed with an object which it holds
	 * @param contents the object to be held
	 */
	public ListObject(T contents) {
		this.contents = contents;
		this.next = null;
		this.prev = null;
	}
	
	/**
	 * Accessor method for the contents of the holding object
	 * @return the contents i.e. the object held.
	 */
	public T getContents() {
		return this.contents;
	}
	/**
	 * Accessor method for the next pointer
	 * @return the pointer to the next node of the list
	 */
	public ListObject<T> getNext() {
		return this.next;
	}
	
	/**
	 * Mutator method for the next pointer
	 * @param next the pointer to the next node of the list
	 */
	public void setNext(ListObject<T> next) {
		this.next = next;
	}
	
	/**
	 * Accessor method for the previous pointer
	 * @return the pointer to the previous node of the list
	 */
	public ListObject<T> getPrev() {
		return this.prev;
	}
	
	/**
	 * Mutator method for the previous pointer
	 * @param prev the pointer to the previous node of the list
	 */
	public void setPrev(ListObject<T> prev) {
		this.prev = prev;
	}
}