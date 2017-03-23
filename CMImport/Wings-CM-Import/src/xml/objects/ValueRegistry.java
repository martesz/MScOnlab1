package xml.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "valueRegistries")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValueRegistry {

	@XmlAttribute(namespace = "http://www.omg.org/XMI", name = "id")
	private String xmiId;

	@XmlAttribute(name = "id")
	private String id;

	@XmlAttribute(name = "flatValueRegistry")
	private String flatValueRegistry;

	@XmlAttribute(name = "generatedHeaderFilesDirectory")
	private String generatedHeaderFilesDirectory;

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

	public String getFlatValueRegistry() {
		return flatValueRegistry;
	}

	public void setFlatValueRegistry(String flatValueRegistry) {
		this.flatValueRegistry = flatValueRegistry;
	}

	public String getGeneratedHeaderFilesDirectory() {
		return generatedHeaderFilesDirectory;
	}

	public void setGeneratedHeaderFilesDirectory(String generatedHeaderFilesDirectory) {
		this.generatedHeaderFilesDirectory = generatedHeaderFilesDirectory;
	}

}
