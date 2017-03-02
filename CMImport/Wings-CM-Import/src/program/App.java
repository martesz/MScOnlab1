package program;

import java.io.FileNotFoundException;

import parser.Parser;
import registry.type.CMType;
import registry.type.Data;
import registry.type.StandardCType;
import registry.value.CMVariable;
import registry.value.Direction;
import registry.value.Mode;

public class App {

	public static void main(String[] args) {
		String xmlTargetPath = args[0];

		Parser parser = new Parser(xmlTargetPath);
		Data data = new StandardCType();
		CMType type = new CMType("id", data);
		CMVariable variable = new CMVariable("name", type, Direction.APP_TO_UI, Mode.COMMON, true);
		try {
			parser.addVariable(variable);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
