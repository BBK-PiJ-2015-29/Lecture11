/**
 * A generic stack which can only hold classes which extend Number
 * PiJ Lecture 11 - ex 5
 * @author ocouls01
 */
public class GenericStack<N extends Number> implements Stack<N> {
	/**
	 * This stack will be based on a doubly linked list
	 */
	private DoubleLinkedList<N> list = new DoubleLinkedList<N>();
	
	/**
	 * Determines if the stack is empty. 
	 * @return true if the stack is empty, false otherwise. 
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * Returns the number of items currently in the stack.
	 * @return the number of items currently in the stack
	 */
	public int size() {
		return list.size();
	}

	/**
	 * Adds an element at the top of the stack. 
	 * @param item the new item to be added
	 */
	public void push(N item) {
		list.add(item);
	}

	/**
	 * Returns the element at the top of the stack. The stack is
	 * left unchanged.
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public N top() {
		return list.get(list.size()-1);
	}
	/**
	 * Returns the element at the top of the stack. The element is
	 * removed from the stack.
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public N pop() {
		return list.remove(list.size()-1);
	}
}