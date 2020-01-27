package BasicCalculator.maven.com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCalc {
	
	@Test
	public void testSum() {
		//BasicCalculator basicCalc = new BasicCalculator(5, 10); // instance of Constructor
	    int subt=BasicCalculator.sub();
		//Assert.assertEquals("true",subt );
	    Assert.assertNotNull(subt);
	    Assert.assertTrue("message", subt>=0);
	    
	  }

}
