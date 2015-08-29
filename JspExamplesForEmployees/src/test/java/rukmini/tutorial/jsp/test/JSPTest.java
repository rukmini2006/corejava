package rukmini.tutorial.jsp.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class JSPTest {
private static Logger logger = Logger.getLogger(JSPTest.class);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String name="Rukmini Mortha";
		logger.info(name.substring(2, 8));
	//	fail("Not yet implemented");
	}
	

}
