package javaclub;

import java.util.HashMap;

/* Python uses list structures very dynamically and allows a lot of liberties
 * which are not there in other languages which will use arrays of a fixed 
 * size, only storing the same data type (i.e. String, int, double). For our
 * implementation of the table structure we made in python, we can consider the 
 * 'record' as a Hashmap, which is essentially a dictionary, with a key of our 
 * field name, then the value as an array of the rest of the data, and the headers
 * as a separate array.*/

/* HashMap usage : HashMap<key_type, value_type> variable_name
 * declaration in python would be : variable_name = {} as an empty dictionary,
 * which is then populated with variable_name[key_name] = [data].*/

public class Table {
	/* Declare our variables to be used in the constructor method.*/
	HashMap<String, int[]> record;
	String[] headers;
	String title;
	int n_fields;
	int n_cols;
			
	/* Constructor method (def __init__) which sets up our properties.*/
	public Table(HashMap<String, int[]> record, String[] headers, String title) {
		this.record = record;
		this.headers = headers;
		this.title = title;
		this.n_fields = record.size();
		this.n_cols = headers.length;	
	}
	
	/* Public - the method can be accessed outside the boundary of this class, when 
	 * you create an instance of the object elsewhere, you can call object.method.
	 * int[] - the data type which will be returned by the method, if it is a procedure,
	 * then there will be a void modifier for data type since nothing is returned.
	 * getRow() - the name of the method.
	 * String field_name - the data type and variable name of the data given to the
	 * method when it is called.*/
	public int[] getRow(String field_name) {
		/* Return then int[] of data in the HashMap from the given key (no need to also
		 * return the key). You can use HashMap.get(field_name) to access the int[] which 
		 * is associated with the key field_name. Include handling for the case where the 
		 * key is not in the HashMap.*/
	}
	
	/* Chosing to not include the sortByHeader method : this implementation in java requires
	 * use of a custom comparator class, and is also generally not needed for a HashMap since
	 * all values can be accessed very quickly anyway.*/
	
	public void addRow(String field_name, int[] data) {
		/* You can simply use HashMap.put(key,value) to add another row to the end. Rather
		 * than returning, we want to change this.record to include the new row.*/
	}
	
	public void setVal(String field_name, String header, int val) {
		/* For this method, we will have to add a new edited version of the row to the HashMap
		 * rather than editing in place, so we can take a copy of the int[], change the value 
		 * at the right index for the header, then use HashMap.remove(key) to clear the old 
		 * version, then use our addRow method to add the new edited one.*/
	}
}
