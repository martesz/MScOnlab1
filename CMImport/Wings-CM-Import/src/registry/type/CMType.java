package registry.type;

public class CMType {
	private String id;
	private Data data;

	public CMType(String id, Data data) {
		super();
		this.id = id;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public Data getData() {
		return data;
	}

}
