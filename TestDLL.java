import org.junit.*;
import static org.junit.Assert.*;

public class TestDLL {
	private DoubleLinkedList<Employee> EmpDLL;
	private DoubleLinkedList<String> StrDLL;
	
	@Before
	public void SetUp() {
	StrDLL = new DoubleLinkedList<String>();
	EmpDLL = new DoubleLinkedList<Employee>();
	}
	
	@Test
	public void testAddMethodOfStringDLL() {
		String s1 = "one";
		String s2 = "two";
		StrDLL.add(s1);
		StrDLL.add(s2);
		
		
		String result1 = StrDLL.get(0);
		assertEquals(s1, result1);
		result1 = StrDLL.get(1);
		assertEquals(s2, result1);
		
		assertNull(StrDLL.get(2));
	
	}
	
	@Test
	public void testAddMethodOfEmployeeDLL() {
		Employee e1 = new Employee("Dave Mathews", "F4415892T");
		Employee e2 = new Employee("Albert Einstein", "G8449416R");
				
		EmpDLL.add(e1);
		EmpDLL.add(e2);
		
		String result = EmpDLL.get(0).getName();
		assertEquals("Dave Mathews", result);
		result = EmpDLL.get(1).getName();
		assertEquals("Albert Einstein", result);
		
	}
	
	@Test
	public void testRemoveMethodOfStringDLL() {
		String s1 = "one";
		String s2 = "two";
		String s3 = "three";
		
		StrDLL.add(s1);
		StrDLL.add(s2);
		StrDLL.add(s3);
		
		String result = StrDLL.remove(1);
		assertEquals(s2, result);
		
		result = StrDLL.get(1);
		assertEquals(s3, result);

	}
	
	@Test
	public void testRemoveMethodOfEmployeeDLL() {
		Employee e1 = new Employee("Dave Mathews", "F4415892T");
		Employee e2 = new Employee("Albert Einstein", "G8449416R");
		Employee e3 = new Employee("Cindy Crawford", "H54644634E");
		
		EmpDLL.add(e1);
		EmpDLL.add(e2);
		EmpDLL.add(e3);
		
		String result = EmpDLL.remove(0).getName();
		assertEquals(e1.getName(), result);
		
		result = EmpDLL.get(0).getName();
		assertEquals(e2.getName(), result);
	}
	
}