package xml.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Content {

	@XmlAttribute(namespace = "http://www.w3.org/2001/XMLSchema-instance", name = "type")
	private String type;

	@XmlAttribute(namespace = "http://www.omg.org/XMI", name = "id")
	private String id;

	@XmlElement(name = "valueRegistries")
	private ValueRegistry valueRegistry;

	@XmlElement(name = "typeRegistries")
	private TypeRegistry typeRegistry;

	@XmlElement(name = "flatValueRegistries")
	private FlatValueRegistry flatValueRegistry;

	@XmlElement(name = "operationModeCollection")
	private OperationModeCollection operationModeCollection;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ValueRegistry getValueRegistry() {
		return valueRegistry;
	}

	public void setValueRegistry(ValueRegistry valueRegistry) {
		this.valueRegistry = valueRegistry;
	}

	public TypeRegistry getTypeRegistry() {
		return typeRegistry;
	}

	public void setTypeRegistry(TypeRegistry typeRegistry) {
		this.typeRegistry = typeRegistry;
	}

	public FlatValueRegistry getFlatValueRegistry() {
		return flatValueRegistry;
	}

	public void setFlatValueRegistry(FlatValueRegistry flatValueRegistry) {
		this.flatValueRegistry = flatValueRegistry;
	}

}
