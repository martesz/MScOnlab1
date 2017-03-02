package registry.value;

import registry.type.CMType;

public class CMVariable {
	private String name;
	private CMType type;
	private Direction direction;
	private Mode mode;
	private boolean trend;

	public CMVariable(String name, CMType type, Direction direction, Mode mode, boolean trend) {
		this.name = name;
		this.type = type;
		this.direction = direction;
		this.mode = mode;
		this.trend = trend;
	}

	public String getName() {
		return name;
	}

	public CMType getType() {
		return type;
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
