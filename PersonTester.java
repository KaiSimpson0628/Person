public class PersonTester {
	public static void main(String[] args) {
		Person p1 = new Person("Kai", 2005);
		System.out.println(p1);
		Person p2 = new Person("Jack", 2008);
		System.out.println(p2);
Scholar s1 = new Scholar("Connor", 2004, "Science");
System.out.println(s1);
Scholar s2 = new Scholar("Ruth", 2004, "Math");
System.out.println(s2);

Instructor i1 = new Instructor("Mr.Smith", 1985, 120000.15);
System.out.println(i1);
Instructor i2 = new Instructor("Mr.Jones", 1945, 1200000.15);
System.out.println(i2);
}
}
