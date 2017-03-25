package pkgMyInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestMyInteger(){

			MyInteger intx = new MyInteger(10);
			
			assertEquals(intx.isEven(),true);
			
			assertEquals(intx.isOdd(),false);
			
			assertEquals(intx.isPrime(),false);
				
			assertEquals(MyInteger.isEven(intx),true);
			
			assertEquals(MyInteger.isOdd(intx),false);
			
			assertEquals(MyInteger.isPrime(intx),false);
			
			assertEquals(MyInteger.isOdd(3),true);
			
			assertEquals(MyInteger.isOdd(4),false);
			
			assertEquals(MyInteger.isEven(2),true);
			
			assertEquals(MyInteger.isPrime(13),true);
			
			assertEquals(MyInteger.isPrime(6),false);
					
			assertEquals(intx.equals(9),false);
			
			assertEquals(intx.equals(intx),true);
			
		}		
}
