package citibank.loanmanagement.service;

import java.util.List;

import citibank.loanmanagement.pojo.CustomerPojo;

public interface CustomerService {

	CustomerPojo saveCustomer(CustomerPojo customerPojo);
	
	CustomerPojo getCustomerint (int id);
	
	
	List<CustomerPojo> listCustomer ();


}
