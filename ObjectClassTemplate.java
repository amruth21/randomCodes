package classes;

public class ObjectClassTemplate implements Comparable{ // No real purpose in implemented
	private int field1;
	private String field2;
	private static int id = 1000; //Field is unique to the class 
	private int myId; //Allows it to change for each object
	
	public ObjectClassTemplate() {
		field1 = 0;
		field2 = "Hello";	
		id++;
		myId = id;
	}
	
	public ObjectClassTemplate(int field1, String field2) {
		this.field1 = field1; //Since I used same variable names I need to specify that I am referring to the field.
		this.field2 = field2;
		id++;
		myId = id;
	}
	
	public ObjectClassTemplate(ObjectClassTemplate other) {
		this.field1 = other.field1;
		this.field2 = other.field2;
		myId = id;
	}
	
	public int getId() {
		return this.myId;
	}
	
	public String toString() {
		return("Field1: " + this.field1 + " Field2: " + this.field2 + " ID: " + this.myId);
	}
	
	public int compareTo(Object other) {
		if(other instanceof ObjectClassTemplate) {
			//other = (ObjectClassTemplate)other;
			if(this.field1 == ((ObjectClassTemplate)other).field1) { //Need parentheses because casting happens last
				return(this.field2.compareTo(((ObjectClassTemplate)other).field2)); // Call to String class's compareTo method
			}
			return(this.field1 - ((ObjectClassTemplate)other).field1);
		}
		return -1;
	}
	
	public boolean equals(ObjectClassTemplate other) {
		return(this.field1 == other.field1 && this.field2.equals(other.field2)); //String class's equals method
	}
	
	public static int nextId() { //Returns next available Id
		return(id +1);
	}
}
