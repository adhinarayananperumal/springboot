package citibank.loanmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import citibank.loanmanagement.pojo.CustomerPojo;
import citibank.loanmanagement.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/welcome")
	public String welcomeCall() {

		return "Welcome to Citi Bank";
	}

	// public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial
	// tutorial) {

	@PostMapping(value = "/save")
	public CustomerPojo saveCustomer(@RequestBody CustomerPojo customerPojo) {

		customerPojo = customerService.saveCustomer(customerPojo);

		return customerPojo;
	}

}
