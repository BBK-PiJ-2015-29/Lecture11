public class DoubleLinkedList<T> {
	private ListObject<T> head;
	private ListObject<T> tail;
	
	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		int result = 0;
		ListObject<T> thisObj = head;
		while (thisObj != null) {
			thisObj = thisObj.getNext();
			result = result + 1;
		}
		return result;
	}
	
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
			for (int i = 0; i < index-1; i++) {
				current = current.getNext();
			}
			output = current.getNext();
			current.setNext(current.getNext().getNext());
			current.getNext().setPrev(current);
			return output.getContents();
		}
	}
}