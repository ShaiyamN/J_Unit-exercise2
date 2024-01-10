import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Array_reverseTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void Test_revArr() {
		Array_reverse s=new Array_reverse();
		int [] expected= {1,2,3,4,5};
		int[] a = {5,4,3,2,1};
		//assertArrayEquals(expected,s.reverse(actual));
		//assertArrayEquals(expected, s.reverse(actual));
		//assertArrayEquals(expected, s.reverse(actual));
		assertArrayEquals(expected,s.reverse(a));
	}
	

}
