package xml.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class OperationMode {

	@XmlAttribute(name = "id")
	private String id;

	@XmlAttribute(namespace = "http://www.omg.org/XMI", name = "id")
	private String xmiId;

	public String getName() {
		return id;
	}

	public void setName(String name) {
		this.id = name;
	}

	public String getId() {
		return xmiId;
	}

	public void setId(String id) {
		this.xmiId = id;
	}

}
