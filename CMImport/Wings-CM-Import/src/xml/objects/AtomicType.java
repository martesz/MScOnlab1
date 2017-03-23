package xml.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class AtomicType {

	@XmlAttribute(namespace = "http://www.omg.org/XMI", name = "id")
	private String xmiId;

	@XmlAttribute(name = "id")
	private String id;

	@XmlAttribute(name = "baseType")
	private String baseType;
	
	@XmlAttribute(name = "documentation")
	private String documentation;
	
	@XmlAttribute(name = "lengthModifier")
	private String lengthModifier;
	
	@XmlAttribute(name = "signModifier")
	private String signModifier;

	public String getXmiId() {
		return xmiId;
	}

	public void setXmiId(String xmiId) {
		this.xmiId = xmiId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public String getLengthModifier() {
		return lengthModifier;
	}

	public void setLengthModifier(String lengthModifier) {
		this.lengthModifier = lengthModifier;
	}

	public String getSignModifier() {
		return signModifier;
	}

	public void setSignModifier(String signModifier) {
		this.signModifier = signModifier;
	}

}
