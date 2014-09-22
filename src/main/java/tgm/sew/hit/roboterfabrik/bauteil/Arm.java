package tgm.sew.hit.roboterfabrik.bauteil;

import java.util.ArrayList;
import java.util.List;


public class Arm extends Bauteil {

	public Arm(int[] data) {
		super(data);
	}
	
	public static Arm parseCSVString(String line) {
		String[] items = line.split(",");
		List<Integer> data = new ArrayList<Integer>();
		
		for (String s : items) {
			try {
				data.add(Integer.parseInt(s));
			} catch(NumberFormatException e) {
				if (!Arm.class.getName().equals(s))
					return null;
			}
		}
		
		int[] dataArray = new int[data.size()];
		
		for (int i = 0; i < data.size(); i++)
			dataArray[i] = data.get(i);
		
		return new Arm(dataArray);
	}
	
}
