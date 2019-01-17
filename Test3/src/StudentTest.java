import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testAlter() {
		Student s1 = new Student("Susi", 2000, "IMA");
		assertEquals("Alter berechnen", 19, s1.getAlter()); //Test Alter Korrekt
	}

}
