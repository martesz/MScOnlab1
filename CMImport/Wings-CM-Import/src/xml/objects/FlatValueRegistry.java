package xml.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "flatValueRegistries")
@XmlAccessorType(XmlAccessType.FIELD)
public class FlatValueRegistry {
	@XmlAttribute(namespace = "http://www.omg.org/XMI", name = "id")
	private String xmiId;

	@XmlAttribute(name = "id")
	private String id;

	@XmlAttribute(name = "documentation")
	private String documentation;

	@XmlAttribute(name = "typeRegistry")
	private String typeRegistry;

	@XmlElement(name = "values")
	private List<FlatValue> flatValues;
	
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

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public String getTypeRegistry() {
		return typeRegistry;
	}

	public void setTypeRegistry(String typeRegistry) {
		this.typeRegistry = typeRegistry;
	}

	public List<FlatValue> getFlatValues() {
		return flatValues;
	}

	public void setFlatValues(List<FlatValue> flatValues) {
		this.flatValues = flatValues;
	}

	
}
