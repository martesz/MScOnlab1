package registry.type;

public class Array<T extends Data> extends Data {

	private int size;
	private T[] items;

	@SuppressWarnings("unchecked")
	public Array(int size) {
		this.size = size;
		items = (T[]) new Object[size];
	}

	public Array(int size, T[] items) {
		this.size = size;
		this.items = items;
	}

	public int getSize() {
		return size;
	}

	public T[] getItems() {
		return items;
	}

}
