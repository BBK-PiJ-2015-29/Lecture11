import org.junit.*;
import static org.junit.Assert.*;

public class TestComparator {
	private Comparator myComp;
	@Before
	public void SetUp() {
		myComp = new Comparator();
	}
	
	@Test
	public void testGetMaxDouble() {
		double d1 = 1.2;
		double d2 = 3.4;
		double max = myComp.getMax(d1,d2);
		
		assertEquals(d2, max, 0.1);
	}
	
	@Test
	public void testGetMaxInt() {
		int n = 5;
		int m = 6;
		int max = myComp.getMax(n,m);
		
		assertEquals(m, max);
	}
	
	
	@Test
	public void testGetMaxString() {
		String s1 = "12";
		String s2 = "30";
		String max = myComp.getMax(s1,s2);
		
		assertEquals(s2, max);
	}
}