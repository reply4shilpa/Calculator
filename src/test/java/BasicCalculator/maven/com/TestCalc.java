package BasicCalculator.maven.com;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestCalc {
	
	@Test
	public void testSum() {
		//BasicCalculator basicCalc = new BasicCalculator(5, 10); // instance of Constructor
	    int subt=BasicCalculator.sub();
	   // Assert.assertNotNull(subt);
	   assertEquals(0, subt);
	    
	  }

}
