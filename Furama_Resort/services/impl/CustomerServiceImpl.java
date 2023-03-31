package services.impl;

import models.person.Customer;
import services.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> customers = new ArrayList<>();

    @Override
    public void displayListCustomers() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id:");
        String code = scanner.nextLine();

        System.out.println("Nhập Tên khách hàng: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh của khách hàng: ");
        String birthDay = scanner.nextLine();

        System.out.println("Nhập giới tính của khách hàng: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập số chúng minh của khách hàng: ");
        String id = scanner.nextLine();

        System.out.println(" Nhập số điện thoại của khách hàng :");
        int numberPhone = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập email của khách hàng:");
        String email = scanner.nextLine();

        System.out.printf("Nhập loại khách hàng");
        String customerType = scanner.nextLine();

        System.out.printf("Nhập địa chỉ khách hàng:");
        String customerAddress = scanner.nextLine();
        Customer customer = new Customer(code, name, birthDay, gender, id, numberPhone, email, customerType, customerAddress);
        customers.add(customer);
    }

    @Override
    public void editCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số chứng minh Cần sửa");
        String id = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < customers.size(); i++) {
            if (id.equals(customers.get(i).getId())){

                System.out.println("Nhập mã khách hàng:");
                String code = scanner.nextLine();

                System.out.println("Nhập Tên khách hàng: ");
                String name = scanner.nextLine();

                System.out.println("Nhập ngày sinh của khách hàng: ");
                String birthDay = scanner.nextLine();

                System.out.println("Nhập giới tính của khách hàng: ");
                String gender = scanner.nextLine();

                System.out.println(" Nhập số điện thoại của khách hàng :");
                int numberPhone = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập email của khách hàng:");
                String email = scanner.nextLine();

                System.out.printf("Nhập loại khách hàng");
                String customerType = scanner.nextLine();

                System.out.printf("Nhập địa chỉ khách hàng:");
                String customerAddress = scanner.nextLine();

                Customer customer = new Customer(code,name,birthDay,gender,id,numberPhone,email,customerType,customerAddress);
                customers.set(i,customer);

            }else {
                count++;
            }
            if (count == customers.size()){
                System.out.println("Số chứng minh nhân dân của khách hàng không tồn tại");
            }
        }
    }
    @Override

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn xoá");
        String id = scanner.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (id.equals(customers.get(i).getId())) {
                customers.remove(customers.get(i));
            }
        }
    }


    @Override
    public void display() {

    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }


    @Override
    public void returnMainMenu() {

    }
}
