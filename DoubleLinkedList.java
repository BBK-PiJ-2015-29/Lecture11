/**
 * The generic doubly linked list, capable of holding objects
 * of any type.
 * PiJ Lecture 11
 * @author ocouls01
 */
public class DoubleLinkedList<T> {
	/**
	 * Two fields pointing to the head and tail of the list.
	 */
	
	private ListObject<T> head;
	private ListObject<T> tail;
	
	/**
	 * Constructor initially sets both head and tail to null.
	 */
	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * Checks if the list is empty
	 * @return true if it is empty, false otherwise
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Returns the current size of the list.
	 * @return the size as an int.
	 */
	public int size() {
		int result = 0;
		ListObject<T> thisObj = head;
		while (thisObj != null) {
			thisObj = thisObj.getNext();
			result = result + 1;
		}
		return result;
	}
	
	/**
	 * Adds an item of generic type to the end of the list.
	 * @param item is the object to be added.
	 */
	public void add(T item) {
		ListObject<T> newObject = new ListObject<T>(item);
		if (isEmpty()) {
				head = newObject;
				tail = newObject;
			} else {
				ListObject<T> current = head;
				while (current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(newObject);
				newObject.setPrev(current);
				tail = newObject;
				
			}
	}
	/**
	 * Retrieves but doesn't remove an item from the list from a desired
	 * position.
	 * @return the object at that place
	 * @param index the place in the list where the desired item is.
	 */
	public T get(int index) {
		if ((index < 0)||(index >= size())) {
			return null;
		} else if (index == 0) {
			return head.getContents();
		} else {
			ListObject<T> current = head;
			for (int i = 0; i < index; i++) {
				current = current.getNext();
			}
			return current.getContents();
		}
	}
	
	/**
	 * Retrieves and removes an item from a place in the list.
	 * @return the object at that place
	 * @param index the place in the list where the desired object is.
	 */
	public T remove(int index) {
		ListObject<T> output = null;
		if ((index < 0)||(index >= size())) {
			return null;
		} else if (index == 0) {
			output = head;
			head = head.getNext();
			return output.getContents();
		} else {
			ListObject<T> current = head;
			for (int i = 0; i < index; i++) {
				current = current.getNext();
			}
			output = current.getNext();
			current.setNext(current.getNext().getNext());
			current.getNext().setPrev(current);
			return output.getContents();
		}
	}
}