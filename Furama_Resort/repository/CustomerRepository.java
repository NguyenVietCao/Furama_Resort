package repository;

import models.person.Customer;
import models.person.Employee;
import utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH_FILE_CUSTOMER = "/Applications/Cao_laptrinh/Cao_codegym/khac/Furama_Resort/Furama_Resort/data/customer.csv";

    @Override
    public List<Customer> displayCustomerRepository() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE_CUSTOMER);
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] arrCustomer = string.split(",");
            Customer customer = new Customer(arrCustomer[0], arrCustomer[1], arrCustomer[2], arrCustomer[3], arrCustomer[4], arrCustomer[5], arrCustomer[6], arrCustomer[7], arrCustomer[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        ReadAndWrite.writeFileCustomer(PATH_FILE_CUSTOMER, customer, true);
    }
}
