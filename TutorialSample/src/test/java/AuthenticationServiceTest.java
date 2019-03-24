/**
 * 
 */
package test.java;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import main.java.AuthenticationService;

/**
 * @author punee
 *
 */
public class AuthenticationServiceTest extends TestCase {
	
	AuthenticationService authenticationService;
	
	@Before
	public void testLoadData()
	{
		authenticationService = new AuthenticationService();
		authenticationService.data = new ArrayList();
		authenticationService.data.add(new String[] {"puneet","verma"});
	}
	
	@Test
	public void testAuthenticate()
	{
		String userName = "puneet";
		String password = "verma";
		assertEquals(true, authenticationService.Authenticate(userName,password));
	}

}
