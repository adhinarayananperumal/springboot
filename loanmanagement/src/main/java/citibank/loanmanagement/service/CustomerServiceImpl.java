package citibank.loanmanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import citibank.loanmanagement.Customer;
import citibank.loanmanagement.pojo.CustomerPojo;
import citibank.loanmanagement.repository.CustomerRepository;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public CustomerPojo saveCustomer(CustomerPojo customerPojo) {
		System.out.println("Inside Save method CustomerServiceI..mpl");
		
		Customer customer = new Customer();
		customer.setCustomerName(customerPojo.getCustomerName());
		customer.setAge(customerPojo.getAge());

		
		customer = customerRepository.save(customer);

		customerPojo.setCid(customer.getCid());
		customerPojo.setCustomerName(customer.getCustomerName());
		customerPojo.setAge(customer.getAge());
		return customerPojo;
		
	}

}
