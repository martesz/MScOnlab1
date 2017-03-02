package parser;

import java.io.File;
import java.io.FileNotFoundException;

import registry.value.CMVariable;

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
}
