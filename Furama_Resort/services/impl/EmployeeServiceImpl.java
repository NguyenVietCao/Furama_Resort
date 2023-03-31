package services.impl;

import models.person.Employee;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
List<Employee> employees = new ArrayList<>();
    @Override
    public void displayListEmployees() {
        for (Employee e:employees) {
            System.out.println(e);
        }
    }

    @Override
    public void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id:");
        String code = scanner.nextLine();

        System.out.println("Nhập Tên Nhân viên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh của Nhân viên: ");
        String birthDay = scanner.nextLine();

        System.out.println("Nhập giới tính của Nhân viên: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập số chúng minh của Nhân viên: ");
        String id = scanner.nextLine();

        System.out.println(" Nhập số điện thoại của Nhân viên :");
        int numberPhone = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập email của Nhân viên:");
        String email = scanner.nextLine();

        System.out.println("Nhập loại Nhân viên");
        String employeeQualifications = scanner.nextLine();

        System.out.println("Nhập địa chỉ Nhân viên:");
        String employeePosition = scanner.nextLine();

        System.out.println("Nhập lương nhân viên");
        float employeeSalary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(code,name,birthDay,gender,id,numberPhone,email,employeeQualifications,employeePosition,employeeSalary);
        employees.add(employee);
    }

    @Override
    public void editEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số chứng minh nhân viên");
        String id = scanner.nextLine();

        for (int i = 0; i < employees.size(); i++) {
            if (id.equals(employees.get(i).getId())){
                System.out.println("Nhập mã nhân viên");
                String code = scanner.nextLine();

                System.out.println("Nhập Tên Nhân viên: ");
                String name = scanner.nextLine();

                System.out.println("Nhập ngày sinh của Nhân viên: ");
                String birthDay = scanner.nextLine();

                System.out.println("Nhập giới tính của Nhân viên: ");
                String gender = scanner.nextLine();


                System.out.println(" Nhập số điện thoại của Nhân viên :");
                int numberPhone = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập email của Nhân viên:");
                String email = scanner.nextLine();

                System.out.println("Nhập loại Nhân viên");
                String employeeQualifications = scanner.nextLine();

                System.out.println("Nhập địa chỉ Nhân viên:");
                String employeePosition = scanner.nextLine();

                System.out.println("Nhập lương nhân viên");
                float employeeSalary = Integer.parseInt(scanner.nextLine());

                Employee employee = new Employee(code,name,birthDay,gender,id,numberPhone,email,employeeQualifications,employeePosition,employeeSalary);
                employees.set(i,employee);
            }

        }

    }
    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số chứng minh cần xoá");
        String id = scanner.nextLine();

        for (int i = 0; i < employees.size(); i++) {
            if (id.equals(employees.get(i).getId())){
                employees.remove(employees.get(i));
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
