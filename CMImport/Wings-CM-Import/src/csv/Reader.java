
package csv;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * 
 * @author kovamr56
 * 
 *         Creates java objects representing CM variables read from a CSV file.
 *
 */
public class Reader {

	public static List<CMVariable> readCsv(File csvFile) throws IOException {
		List<CMVariable> result = new ArrayList<CMVariable>();
		CSVParser csvParser = CSVParser.parse(csvFile, Charset.defaultCharset(),
				CSVFormat.newFormat(';').withHeader(Headers.class));
		List<CSVRecord> records = csvParser.getRecords();
		if (records.size() > 1) {
			ListIterator<CSVRecord> it = records.listIterator(1);
			while (it.hasNext()) {
				CSVRecord record = it.next();
				if (record.size() > 13) {
					CMVariable cmVariable = new CMVariable.Builder()
							.setId(record.get(Headers.ID))
							.setLength(record.get(Headers.length))
							.setSignalAttribute(record.get(Headers.SignalAttributeTRMTSignalDatabase))
							.setBBVariableType(record.get(Headers.BB_VariableType))
							.setBBVariableSize(record.get(Headers.BB_VariableSize))
							.setBBDefault(record.get(Headers.BB_Default))
							.setBBMin(record.get(Headers.BB_Min))
							.setBBMax(record.get(Headers.BB_Max))
							.setBBStep(record.get(Headers.BB_Step))
							.setBBUnit(record.get(Headers.BB_Unit))
							.setBBPressingST(record.get(Headers.BB_Pressing_ST))
							.setBBSelectabilityST(record.get(Headers.BB_Selectability_ST))
							.setBBVisibility_ST(record.get(Headers.BB_Visibility_ST))
							.setDigitalData(record.get(Headers.DigitalData))
							.build();
					result.add(cmVariable);
				}
			}
		}
		return result;

	}
}
