import org.junit.*;
import static org.junit.Assert.*;

public class TestGenericStack {
	GenericStack<Integer> intStack;
 	@Before
	public void SetUp() {
		intStack = new GenericStack<Integer>();
	}
	
	@Test
	public void testPushOnIntegerStack() {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(3);
		
		intStack.push(i1);
		int result = intStack.top().intValue();
		assertEquals(i1.intValue(), result);
		
		intStack.push(i2);
		result = intStack.top().intValue();
		assertEquals(i2.intValue(), result);
	}
	
	@Test
	public void testPopOnIntegerStack() {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(3);
		
		intStack.push(i1);
		intStack.push(i2);
		intStack.push(i3);
		
		int result = intStack.top().intValue();
		assertEquals(i3.intValue(), result);
	}
}