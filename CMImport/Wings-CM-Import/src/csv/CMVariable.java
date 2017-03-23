package csv;

/**
 * 
 * @author kovamr56
 * 
 *         Represents one variable read from the exported csv file.
 *
 */
public class CMVariable {
	private String iD;
	private String length;
	private String signalAttributeTRMTSignalDatabase;
	private String BBVariableType;
	private String BBVariableSize;
	private String BBDefault;
	private String BBMin;
	private String BBMax;
	private String BBStep;
	private String BBUnit;
	private String BBPressingST;
	private String BBSelectabilityST;
	private String BBVisibility_ST;
	private String digitalData;

	public static class Builder {
		private CMVariable cmVariable;

		public Builder() {
			cmVariable = new CMVariable();
		}

		public Builder setId(String id) {
			cmVariable.iD = id;
			return this;
		}

		public Builder setLength(String length) {
			cmVariable.length = length;
			return this;
		}

		public Builder setSignalAttribute(String signalAttribute) {
			cmVariable.setSignalAttributeTRMTSignalDatabase(signalAttribute);
			return this;
		}

		public Builder setBBVariableType(String variableType) {
			cmVariable.setBBVariableType(variableType);
			return this;
		}

		public Builder setBBVariableSize(String variableSize) {
			cmVariable.setBBVariableSize(variableSize);
			return this;
		}

		public Builder setBBDefault(String bBDefault) {
			cmVariable.setBBDefault(bBDefault);
			return this;
		}

		public Builder setBBMin(String bBMin) {
			cmVariable.setBBMin(bBMin);
			return this;
		}

		public Builder setBBMax(String bBMax) {
			cmVariable.setBBMax(bBMax);
			return this;
		}

		public Builder setBBStep(String bBStep) {
			cmVariable.setBBStep(bBStep);
			;
			return this;
		}

		public Builder setBBUnit(String bBUnit) {
			cmVariable.setBBUnit(bBUnit);
			return this;
		}

		public Builder setBBPressingST(String bBPressingST) {
			cmVariable.setBBPressingST(bBPressingST);
			return this;
		}

		public Builder setBBSelectabilityST(String bBSelectabilityST) {
			cmVariable.setBBSelectabilityST(bBSelectabilityST);
			return this;
		}

		public Builder setBBVisibility_ST(String bBVisibility_ST) {
			cmVariable.setBBVisibility_ST(bBVisibility_ST);
			return this;
		}

		public Builder setDigitalData(String digitalData) {
			cmVariable.setDigitalData(digitalData);
			return this;
		}

		public CMVariable build() {
			return cmVariable;
		}
	}

	private CMVariable() {

	}

	public CMVariable(String iD, String length, String signalAttributeTRMTSignalDatabase, String bBVariableType,
			String bBVariableSize, String bBDefault, String bBMin, String bBMax, String bBStep, String bBUnit,
			String bBPressingST, String bBSelectabilityST, String bBVisibility_ST, String digitalData) {
		super();
		this.iD = iD;
		this.length = length;
		this.signalAttributeTRMTSignalDatabase = signalAttributeTRMTSignalDatabase;
		BBVariableType = bBVariableType;
		BBVariableSize = bBVariableSize;
		BBDefault = bBDefault;
		BBMin = bBMin;
		BBMax = bBMax;
		BBStep = bBStep;
		BBUnit = bBUnit;
		BBPressingST = bBPressingST;
		BBSelectabilityST = bBSelectabilityST;
		BBVisibility_ST = bBVisibility_ST;
		this.digitalData = digitalData;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getSignalAttributeTRMTSignalDatabase() {
		return signalAttributeTRMTSignalDatabase;
	}

	public void setSignalAttributeTRMTSignalDatabase(String signalAttributeTRMTSignalDatabase) {
		this.signalAttributeTRMTSignalDatabase = signalAttributeTRMTSignalDatabase;
	}

	public String getBBVariableType() {
		return BBVariableType;
	}

	public void setBBVariableType(String bBVariableType) {
		BBVariableType = bBVariableType;
	}

	public String getBBVariableSize() {
		return BBVariableSize;
	}

	public void setBBVariableSize(String bBVariableSize) {
		BBVariableSize = bBVariableSize;
	}

	public String getBBDefault() {
		return BBDefault;
	}

	public void setBBDefault(String bBDefault) {
		BBDefault = bBDefault;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getBBMin() {
		return BBMin;
	}

	public void setBBMin(String bBMin) {
		BBMin = bBMin;
	}

	public String getBBMax() {
		return BBMax;
	}

	public void setBBMax(String bBMax) {
		BBMax = bBMax;
	}

	public String getBBStep() {
		return BBStep;
	}

	public void setBBStep(String bBStep) {
		BBStep = bBStep;
	}

	public String getBBUnit() {
		return BBUnit;
	}

	public void setBBUnit(String bBUnit) {
		BBUnit = bBUnit;
	}

	public String getBBPressingST() {
		return BBPressingST;
	}

	public void setBBPressingST(String bBPressingST) {
		BBPressingST = bBPressingST;
	}

	public String getBBSelectabilityST() {
		return BBSelectabilityST;
	}

	public void setBBSelectabilityST(String bBSelectabilityST) {
		BBSelectabilityST = bBSelectabilityST;
	}

	public String getBBVisibility_ST() {
		return BBVisibility_ST;
	}

	public void setBBVisibility_ST(String bBVisibility_ST) {
		BBVisibility_ST = bBVisibility_ST;
	}

	public String getDigitalData() {
		return digitalData;
	}

	public void setDigitalData(String digitalData) {
		this.digitalData = digitalData;
	}

}
