public class ListObject<T> {
	private T contents;
	private ListObject<T> next;
	private ListObject<T> prev;
	
	public ListObject(T contents) {
		this.contents = contents;
		this.next = null;
		this.prev = null;
	}
	
	public T getContents() {
		return this.contents;
	}
	
	public ListObject<T> getNext() {
		return this.next;
	}
	public void setNext(ListObject<T> next) {
		this.next = next;
	}
	
	
	public ListObject<T> getPrev() {
		return this.prev;
	}
	public void setPrev(ListObject<T> prev) {
		this.prev = prev;
	}
}