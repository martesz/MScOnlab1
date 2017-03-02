package registry.value;

import registry.type.Data;

public class CMVariable {
	private String name;
	private Data data;
	private Direction direction;
	private Mode mode;
	private boolean trend;

	public CMVariable(String name, Data data, Direction direction, Mode mode, boolean trend) {
		super();
		this.name = name;
		this.data = data;
		this.direction = direction;
		this.mode = mode;
		this.trend = trend;
	}

	public String getName() {
		return name;
	}

	public Data getData() {
		return data;
	}

	public Direction getDirection() {
		return direction;
	}

	public Mode getMode() {
		return mode;
	}

	public boolean isTrend() {
		return trend;
	}

}
