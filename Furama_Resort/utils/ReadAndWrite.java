package utils;

import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    Scanner scanner = new Scanner(System.in);

    //    static ArrayList<Product> productArrayList = new ArrayList<>();
    private static final String EMPLOYEE_LIST_PATH = "/Applications/Cao_laptrinh/Cao_codegym/khac/Furama_Resort/Furama_Resort/data/employee.csv";
    //    private static final String COUNTRY_LIST_PATH = "/Applications/Cao_laptrinh/Cao_codegym/Module2/NguyenVietCao_Module2/src/ss17/quan_ly_san_pham/data/Product.csv";

    public static void writeEmployeeToFile(List<Employee> employeeList) {
        File file = new File(EMPLOYEE_LIST_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employeeList) {
                bufferedWriter.write(e.getInformationToEmployeeCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(EMPLOYEE_LIST_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employeeArr = line.split(",");
                Employee employee = new Employee(employeeArr[0], employeeArr[1], employeeArr[2], employeeArr[3], employeeArr[4], employeeArr[5], employeeArr[6], employeeArr[7], employeeArr[8], employeeArr[9]);
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }


//    public static void main(String[] args) {
//        File file = new File("/Applications/Cao_laptrinh/Cao_codegym/Module2/NguyenVietCao_Module2/src/ss16/read_file/hello.txt");
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader(file);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = null;
//        while (true){
//            try {
//                if (!((line = bufferedReader.readLine()) != null)) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.printf(line);
//        }
//    }
//}

    //
    //    public static List<Product> readFileBinary(){
    //        List<Product> productList = new ArrayList<>();
    //        FileInputStream fileInputStream = null;
    //        ObjectInputStream objectInputStream = null;
    //        try {
    //            if (file.length()>0){
    //                fileInputStream = new FileInputStream(file);
    //                objectInputStream = new ObjectInputStream(fileInputStream);
    //                productList = (List<Product>) objectInputStream.readObject();
    //            }
    //        }catch (IOException ioException){
    //
    //    } catch (ClassNotFoundException e) {
    //            throw new RuntimeException(e);
    //        }
    //        return productList;
    //}
    //public static void writeListProductToFileDat(List<Product> productList){
    //    FileOutputStream fileOutputStream = null;
    //    ObjectOutputStream objectOutputStream = null;
    //    try {
    //        fileOutputStream = new FileOutputStream(file);
    //        objectOutputStream = new ObjectOutputStream(fileOutputStream);
    //        objectOutputStream.writeObject(productList);
    //
    //    } catch (FileNotFoundException e) {
    //        throw new RuntimeException(e);
    //    } catch (IOException e) {
    //        throw new RuntimeException(e);
    //    }
    //}
    //}
}
