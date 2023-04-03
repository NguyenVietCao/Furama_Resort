package controllers;

import models.person.Employee;
import services.impl.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static BookingServiceImpl bookingService = new BookingServiceImpl();
    static PromotionServiceImpl promotionService = new PromotionServiceImpl();

    public static void displayMenu() {
        boolean check = true;
        do {
            System.out.println("Chọn chức năng theo số: \n" +
                    "1. Employee Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management \n" +
                    "6. Exit: \n" +
                    "chọn chức năng:");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    employeeManager();
                    break;
                case 2:
                    customerManager();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    check=false;
                    break;
                default:
                    System.out.println("Bạn nhập sai xin mời nhập lại");
            }

        } while (check);
    }

    public static void employeeManager(){
        Boolean check = true;
        do {
            System.out.println("1. Add Employee." +
                    "\n2. Edit Employee." +
                    "\n3. Delete Employee." +
                    "\n4. Display Employee." +
                    "\n5. Return Menu.");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    employeeService.addNewEmployee();
                    break;
                case "2":
                    employeeService.editEmployee();
                    break;
                case "3":
                    employeeService.delete();
                    break;
                case "4":
                    employeeService.displayListEmployees();
                    break;
                case "5":
                    check = false;
                    break;
                default:
                    System.out.println("Mời bạn chọn lại");
                    break;
            }
        }while (check);

    }

    public static void customerManager(){
       Boolean check = true;
       do {
           System.out.println("1. Add Customer."+
                   "\n2. Edit Customer."+
                   "\n3. Delete Customer."+
                   "\n4. Display Customer."+
                   "\n5. Return Menu.");
           String choose = scanner.nextLine();
           switch (choose){
               case "1":
                   customerService.addNewCustomer();
                   break;
               case "2":
                   customerService.editCustomer();
                   break;
               case "3":
                   customerService.delete();
                   break;
               case "4":
                   customerService.displayListCustomers();
                   break;
               case "5":
                   check = false;
                   break;
               default:
                   System.out.println("Mời bạn chọn lại");
           }
       }while (check);

    }
    public static void facilityManagement(){
        Boolean check = true;
        do {
            System.out.println("1. Display list facility" +
                    "\n2. Add new facility." +
                    "\n3. Display list facility maintenance" +
                    "\n4. Return Menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    facilityService.displayListFacility();
                    break;
                case "2":
                    facilityService.addNewFacility();
                    break;
                case "3":
                    facilityService.displayListFacilityMaintenance();
                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        }while (check) ;

    }
    public static void bookingManagement(){
        System.out.println("1. Add new booking."+
                "\n2. Display list booking"+
                "\n3. Create new contract"+
                "\n4. Display list contracts"+
                "\n5. Edit contracts"+
                "\n6. Return main menu");
        String choose = scanner.nextLine();
        switch (choose){
            case "1":
                bookingService.addNewBooking();
            case "2":
                bookingService.displayListBooking();
            case "3":
                bookingService.createNewContract();
            case "4":
                bookingService.displayListContracts();
            case "5":
                bookingService.editContracts();
            case "6":
                bookingService.returnMainMenu();
            default:
                System.out.println("Mời nhập lại");
        }
    }
    public static void promotionManagement(){
        System.out.println("1. Display list customers use service"+
                "\n2. Display list customers get voucher"+
                "\n3. Return main menu");
        String choose = scanner.nextLine();
        switch (choose){
            case "1":
                promotionService.displayListCustomersUseService();
            case "2":
                promotionService.displayListCustomersGetVoucher();
            case "3":
                promotionService.returnMainMenu();
            default:
                System.out.println("Mời nhập lại");

        }
    }
}
