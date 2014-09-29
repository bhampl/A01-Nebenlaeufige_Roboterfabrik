package tgm.sew.hit.roboterfabrik.util.csv;

import java.util.ArrayList;
import java.util.List;

public class CSVData {

	public List<CSVLine> lines;

	public CSVData() {
		this.lines = new ArrayList<CSVLine>();
	}

	public CSVData(List<CSVLine> lines) {
		this();
		if (lines != null)
			this.lines.addAll(lines);
	}
	
	public void addLine(CSVLine line) {
		this.lines.add(line);
	}
	
	public List<CSVLine> getLines() {
		return this.lines;
	}
}