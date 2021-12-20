package citibank.loanmanagement.service;

import java.util.List;

import citibank.loanmanagement.pojo.CustomerPojo;

public interface CustomerService {

	CustomerPojo saveCustomer(CustomerPojo customerPojo);
	
	CustomerPojo getCustomer (int id);
	
	List<CustomerPojo> listCustomer ();
	
	void update (CustomerPojo customerPojo);
	
	void delete (int cusId);




}
