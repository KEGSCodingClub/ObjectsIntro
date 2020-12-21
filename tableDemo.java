package javaclub;

import java.util.HashMap;

public class tableDemo {

	public static void main(String[] args) {
		/* Create the HashMap and populate with some values.*/
		HashMap<String, int[]> record = new HashMap<String, int[]>();
		String[] headers = new String[]{"field_name","size","id"};
		record.put("A", new int[] {7,10001});
		record.put("B", new int[] {3,10002});
		record.put("C", new int[] {13,10003});
		record.put("D", new int[] {2,10004});
		
		/* Initialise new object with our own data type of Table.*/
		Table table = new Table(record, headers, "My Table");
		
		/* We can now interact with the object table using the methods from the class.*/
		System.out.println(table.title);
		System.out.println(table.getRow("B"));
	}
}
