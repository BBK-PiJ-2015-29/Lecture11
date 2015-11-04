/**
 * An interface for a stack of phone numbers
 */
 public interface NumberStack{
 
	/**
     * Pushes a new string onto the stack
	 *
	 * @param newNumber is the number to be added to the stack
     */
    void push(String newNumber);

    /**
     * Retrieves the last element from the stack and returns it. 
     * If the stack is empty, returns null.
	 * 
	 * @return is the number of the top element of the stack.
     */
    String pop();

    /**
     * Returns the last element from the stack (does not remove it).
     * If the stack is empty, returns null.
	 * 
	 * @return is the number of the top element of the stack.
     */
    String peek();

    /**
     * Returns true if the stack contains no elements, 
     * false otherwise. 
	 *
	 * @return true if there are no elements in the stack, false otherwise.
     */
    boolean isEmpty();
}