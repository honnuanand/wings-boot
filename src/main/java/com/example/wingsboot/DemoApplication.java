package com.example.wingsboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping( method = RequestMethod.GET)
	public String hello() {
		return "<html>" +
				"Pivotal Powered Hybrid Cloud at <b>Albertsons companies</b>- Quick Demo" +
				"</html>";
	}
}
