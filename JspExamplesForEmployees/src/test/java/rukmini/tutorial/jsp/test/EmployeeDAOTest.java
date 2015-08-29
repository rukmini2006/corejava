package rukmini.tutorial.jsp.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.tutorial.jsp.DO.EmployeeDO;
import com.tutorial.jsp.dao.EmployeeDAO;
import com.tutorial.jsp.dao.EmployeeDAOImpl;

public class EmployeeDAOTest {
	EmployeeDAO dao=null;
	@Before
	public void setUp() throws Exception {
		 dao = new EmployeeDAOImpl();
	}
//@Ignore
	@Test
	public void testGetEmployeeDetails() {
		EmployeeDO empDO= dao.getEmployeeDetails("100");
	//	Assert.assertNotNull(empDO);
		Assert.assertEquals(empDO.getFname(), "Steven");
	}
//@Ignore
	/*@Test
	public void testGetEmployees() {
		fail("Not yet implemented");
	}*/

}
