package in.happy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.happy.service.WelcomeService;

@RestController
public class WelcomeRestController {
	@Autowired
private WelcomeService welcomeservice;
	@GetMapping("/welcome")
	private ResponseEntity<String> welcome(){
		String responseMsg = welcomeservice.getWelcomeMsg();
		return new ResponseEntity<>(responseMsg , HttpStatus.OK);
		
	}
	@GetMapping("/greet")
	private ResponseEntity<String> greet(){
		String responseMsg = welcomeservice.getGrertMsg();
		return new ResponseEntity<>(responseMsg , HttpStatus.OK);
	}
}
