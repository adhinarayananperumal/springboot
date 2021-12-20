package citibank.loanmanagement.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import citibank.loanmanagement.entity.Customer;
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

	@Override
	public CustomerPojo getCustomer(int id) {
		Customer customer = customerRepository.getById(id);

		CustomerPojo customerPojo = new CustomerPojo();
		customerPojo.setCid(customer.getCid());
		customerPojo.setCustomerName(customer.getCustomerName());
		customerPojo.setAge(customer.getAge());

		return customerPojo;
	}

	@Override
	public List<CustomerPojo> listCustomer() {
		List<CustomerPojo> customerPojoList = new ArrayList<CustomerPojo>();

		List<Customer> cus = customerRepository.findAll();

		for (Customer customer : cus) {
			CustomerPojo customerPojo = new CustomerPojo();
			customerPojo.setCid(customer.getCid());
			customerPojo.setCustomerName(customer.getCustomerName());
			customerPojo.setAge(customer.getAge());

			customerPojoList.add(customerPojo);
		}

		return customerPojoList;
	}

	@Override
	public void update(CustomerPojo customerPojo) {

		Customer customer = customerRepository.getById(customerPojo.getCid());
		customer.setCustomerName(customerPojo.getCustomerName());
		customer.setAge(customerPojo.getAge());


	}

}
