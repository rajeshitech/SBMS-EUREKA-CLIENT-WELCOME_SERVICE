package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.GreetServiceClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetServiceClient greetClient;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String welcomeResponse = "Welcome to Ashok IT...!!";
		
		String greetResponse = greetClient.invokeGreetService();
		
		String finalResp = greetResponse + " " + welcomeResponse;
		
		return finalResp;
	}
}
