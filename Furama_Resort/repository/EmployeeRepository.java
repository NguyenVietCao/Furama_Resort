package repository;

import models.person.Employee;
import utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH_FILE_EMPLOYEE = "/Applications/Cao_laptrinh/Cao_codegym/khac/Furama_Resort/Furama_Resort/data/employee.csv";
    @Override
    public List<Employee> displayEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String>stringList = ReadAndWrite.readFile(PATH_FILE_EMPLOYEE);
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] arrEmployee = string.split(",");
            Employee employee = new Employee(arrEmployee[0],arrEmployee[1],arrEmployee[2],arrEmployee[3],arrEmployee[4],arrEmployee[5],arrEmployee[6],arrEmployee[7],arrEmployee[8],arrEmployee[9] );
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        ReadAndWrite.writeFileEmployee(PATH_FILE_EMPLOYEE,employee,true);
    }

    @Override
    public void editEmployeeRepository(List<Employee>employees) {
        ReadAndWrite.writeEmployeeToFile(PATH_FILE_EMPLOYEE,employees,false);
    }

    //private static final String PATH_FILE = "src\\case_study\\furama_resort_manager\\data\\employee_data.csv";
    //
    //@Override
    //public List<Employee> display() {
    //    List<Employee> employeeList = new ArrayList<>();
    //    List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
    //    for (int i = 0; i < stringList.size(); i++) {
    //        String string = stringList.get(i);
    //        String[] arr = string.split(",");
    //        Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Float.parseFloat(arr[9]));
    //        employeeList.add(employee);
    //    }
    //    return employeeList;
    //}
    //
    //@Override
    //public void add(Employee employee) {
    //    List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
    //    stringList.add(employee.getInfoToEmployee());
    //    for (int i = 0; i < stringList.size(); i++) {
    //        if (i == 0) {
    //            ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), false);
    //        } else {
    //            ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), true);
    //        }
    //    }
    //}
}
