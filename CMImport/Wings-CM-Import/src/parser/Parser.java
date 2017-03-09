package parser;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import registry.value.CMVariable;
import xml.objects.ModelRoot;

public class Parser {

	private String targetXmlPath;

	public Parser(String targetXmlPath) {
		super();
		this.targetXmlPath = targetXmlPath;
	}

	public void addVariable(CMVariable variable) throws FileNotFoundException {
		File targetXml = new File(targetXmlPath);
		if (targetXml.exists()) {

		} else {
			throw new FileNotFoundException("Target xml file does not exist.");
		}
	}

	public ModelRoot unmarshalXml(String xmlPath) throws JAXBException {
		File file = new File(xmlPath);
		JAXBContext context = JAXBContext.newInstance(ModelRoot.class);

		Unmarshaller unmarshaller = context.createUnmarshaller();
		ModelRoot modelRoot = (ModelRoot) unmarshaller.unmarshal(file);
		return modelRoot;
	}
}
