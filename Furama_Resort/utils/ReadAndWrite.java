package utils;

import models.person.Customer;
import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    //public class ReadAndWrite {
    public static List<String> readFile(String pathFile){
        List<String>stringList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
    public static void writeFileEmployee(String pathFile, Employee employee, boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathFile,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(employee.getInformationToEmployeeCsv());
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFileCustomer(String pathFile, Customer customer, boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathFile,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.getInformationToCustomerCsv());
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeEmployeeToFile(String pathFile, List<Employee> employees,boolean append) {

    //    public static void writeFile(String pathFile, String line,boolean append) {
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter=new FileWriter(pathFile,append);
                bufferedWriter=new BufferedWriter(fileWriter);
                for (Employee e:employees) {
                    bufferedWriter.write(e.getInformationToEmployeeCsv());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    public static void writeCustomerToFile(String pathFile, List<Customer> customers, boolean append) {

        //    public static void writeFile(String pathFile, String line,boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter=new FileWriter(pathFile,append);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (Customer c:customers) {
                bufferedWriter.write(c.getInformationToCustomerCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

