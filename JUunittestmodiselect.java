
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class JUnitmodiselectionTest {

	@Test
	void test() {
		modiselection m = new modiselection();
		int[] arr1= {3,6,8,7,0,2,4,5};
		int[] arr2= {3,8,6,4,5,7,0,2};
		assertEquals(Arrays.toString(modiselection.mSelection(arr1)),Arrays.toString(modiselection.mSelection(arr2)));
	}
}
