package xml.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "operationModeCollection")
@XmlAccessorType(XmlAccessType.FIELD)
public class OperationModeCollection {
	@XmlAttribute(namespace = "http://www.omg.org/XMI", name = "id")
	private String xmiId;

	@XmlElement(name = "modes")
	private List<OperationMode> operationModes;

	public String getXmiId() {
		return xmiId;
	}

	public void setXmiId(String xmiId) {
		this.xmiId = xmiId;
	}

	public List<OperationMode> getOperationModes() {
		return operationModes;
	}

	public void setOperationModes(List<OperationMode> operationModes) {
		this.operationModes = operationModes;
	}

}
