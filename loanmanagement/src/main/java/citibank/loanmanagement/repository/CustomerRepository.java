package citibank.loanmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import citibank.loanmanagement.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
