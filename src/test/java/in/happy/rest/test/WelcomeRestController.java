package in.happy.rest.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.happy.service.WelcomeService;
@WebMvcTest(value= WelcomeRestController.class)
public class WelcomeRestController {
@MockBean	
private WelcomeService welcomeservice;
@Autowired
private MockMvc mockmvc;
@Test
public void testgreet() throws Exception {
	
	when(welcomeservice.getWelcomeMsg()).thenReturn("Good morning");
	MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
	
	MvcResult result = mockmvc.perform(requestBuilder).andReturn();
	MockHttpServletResponse response = result.getResponse();
	int status = response.getStatus();
	assertEquals(200, status);
}
//@Test
//public void testWelcome() throws Exception {
//	
//	when(welcomeservice.getWelcomeMsg()).thenReturn("Good morning");
//	MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
//	
//	MvcResult result = mockmvc.perform(requestBuilder).andReturn();
//	MockHttpServletResponse response = result.getResponse();
//	int status = response.getStatus();
//	assertEquals(200, status);
//}
}
