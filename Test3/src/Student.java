/**
 * Klasse student
 * @author meyer.lokal
 *
 */
public class Student {
	private String name;
	private int gebJahr;
	private String studiengang;
	
	/**
	 * Konstruktor 
	 * @param name
	 * @param gebJahr
	 * @param studiengang
	 */
	public Student(String name, int gebJahr, String studiengang) {
		super();
		this.name = name;
		this.gebJahr = gebJahr;
		this.studiengang = studiengang;
	}

	/**
	 * Konsolenausgabe der wichtigsten Attribute
	 */
	public void ausgeben() {
		System.out.println(name + " / " + studiengang + " / " + gebJahr);
	}

	public int getAlter() {
		return 0;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Susi", 1998, "IMA");
		s1.ausgeben();

	}

}
