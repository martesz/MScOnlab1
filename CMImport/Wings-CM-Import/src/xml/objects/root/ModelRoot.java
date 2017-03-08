package xml.objects.root;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "wings_common_modelroot:PartModelRoot")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModelRoot {

	@XmlElement(name = "content")
	private Content content;

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
}