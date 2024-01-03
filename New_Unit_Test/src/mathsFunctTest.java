import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mathsFunctTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	void Test_mult() {
		mathsFunct prod=new mathsFunct();
		int expected=24, actual=prod.mult(2, 3, 4);
		assertEquals(expected,actual);
	}
	
	void Test_div() {
		mathsFunct  rem=new  mathsFunct();
		double expected=10, actual=rem.div(20, 2);
		assertEquals(expected,actual);
	}
	
	void Test_sum() {
		mathsFunct  res=new  mathsFunct();
		int expected=25, actual=res.sum(10, 15);
		assertEquals(expected,actual);
		
	}


}
