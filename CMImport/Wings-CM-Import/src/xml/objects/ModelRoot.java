package xml.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://bbraun.com/nds/com/bbraun/wings/model/common/modelroot", name = "PartModelRoot")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModelRoot {

	@XmlElement(name = "content")
	private Content content;

	@XmlAttribute(namespace = "http://www.omg.org/XMI", name = "id")
	private String id;

	@XmlAttribute(name = "modelVersion")
	private String modelVersion;

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelVersion() {
		return modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}

}