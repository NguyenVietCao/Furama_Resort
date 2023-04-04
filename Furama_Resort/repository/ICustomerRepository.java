package repository;

import models.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> displayCustomerRepository();
    void addCustomer(Customer customer);
}
