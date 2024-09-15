package in.happy.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class WelcomeService {

	public String getWelcomeMsg() {
		String msg = "Good morning";
		return msg;
	}
	public String getGrertMsg() {
		String msg = "all the best";
		return msg;
		
	}

}
