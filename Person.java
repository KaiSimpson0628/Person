public class Person {
	private String name;
	private int yearofBirth;
	
	
	
	public Person(String name, int birth) {
		this.name = name;
		yearofBirth = birth;

	}
public String toString() {
	return(name + " Was born in " + yearofBirth);
}
}
