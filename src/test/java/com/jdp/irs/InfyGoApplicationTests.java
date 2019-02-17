package com.jdp.irs;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.Assert.fail;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.jdp.irs.model.User;
import com.jdp.irs.service.RegistrationService;
import com.jdp.irs.exception.UserIdAlreadyPresentException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InfyGoApplicationTests {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Autowired
	private RegistrationService registrationService;

//	@Test
	public void contextLoads() {
		System.out.println("in context");
	}

//	@Test
	public void testAddUndefinedUser() {
		System.out.println("in testAddUndefinedUser");
		User user = new User();
		try {
			registrationService.registerUser(user);
			fail("Expected Exception not thrown.");
		}
		catch (Exception e) {
			assertThatExceptionOfType(Exception.class);
//			assertThatExceptionOfType(UserIdAlreadyPresentException.class);			
		}
		System.out.println("in testAddUndefinedUser. return.");
	}

	@Test//(expected = Exception.class)
	public void testAddUndefinedUser2() throws Exception {
		System.out.println("in testAddUndefinedUser2");
//		thrown.expect(UserIdAlreadyPresentException.class);
		thrown.expect(Exception.class);
		thrown.expectMessage("Exception");
		User user = new User();
		registrationService.registerUser(user);
		System.out.println("in testAddUndefinedUser2. return.");
	}
//	@Test(expected = UserIdAlreadyPresentException.class)
	public void testAddUndefinedUser3() throws Exception {
		System.out.println("in testAddUndefinedUser3");
		User user = new User();
		registrationService.registerUser(user);
		System.out.println("in testAddUndefinedUser3. return.");
	}
}
