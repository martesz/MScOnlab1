package xml.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "typeRegistries")
@XmlAccessorType(XmlAccessType.FIELD)
public class TypeRegistry {

	@XmlAttribute(namespace = "http://www.omg.org/XMI", name = "id")
	private String xmiId;

	@XmlAttribute(name = "id")
	private String id;

	@XmlAttribute(name = "documentation")
	private String documentation;

	@XmlElementWrapper(name = "atomicTypeRegistry")
	@XmlElement(name = "types")
	private List<AtomicType> atomicTypes;

	@XmlElementWrapper(name = "symbolicConstantRegistry")
	@XmlElement(name = "symbolicConstants")
	private List<SymbolicConstant> symbolicConstants;

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

	public List<AtomicType> getAtomicTypes() {
		return atomicTypes;
	}

	public void setAtomicTypes(List<AtomicType> atomicTypes) {
		this.atomicTypes = atomicTypes;
	}

	public List<SymbolicConstant> getSymbolicConstants() {
		return symbolicConstants;
	}

	public void setSymbolicConstants(List<SymbolicConstant> symbolicConstants) {
		this.symbolicConstants = symbolicConstants;
	}

}
