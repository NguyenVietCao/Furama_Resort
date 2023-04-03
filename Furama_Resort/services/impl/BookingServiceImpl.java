package services.impl;

import models.Booking;
import services.IBookingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceImpl implements IBookingService {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static List<Booking> bookingList = new ArrayList<>();
    static VillaService villaService = new VillaService();
    static HouseService houseService = new HouseService();
    static RoomService roomService = new RoomService();
    static Scanner scanner = new Scanner(System.in);

    static {
        Booking h1 = new Booking("h1", "5/1/2023", "10/2/2023", "1", "2", "3");
        Booking v1 = new Booking("v1", "4/1/2023", "12/3/2023", "11", "22", "33");
        Booking r1 = new Booking("r1", "1/1/2023", "1/6/2023", "9", "8", "7");
        bookingList.add(h1);
        bookingList.add(v1);
        bookingList.add(r1);
    }

    @Override
    public void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        //mã booking, ngày bắt đầu, ngày kết thúc, mã
        //khách hàng, tên dịch vụ, loại dịch vụ.
        System.out.println("Nhập mã booking:");
        String bookingCode = scanner.nextLine();

        System.out.println("Nhập ngày bắt đầu:");
        String startDay = scanner.nextLine();

        System.out.println("Nhập ngày kết thúc:");
        String endDay = scanner.nextLine();

        customerService.displayListCustomers();
        System.out.println("Nhập mã khách hàng:");
        String customerCode = scanner.nextLine();
        for (int i = 0; i < ; i++) {
            
        }
        

        facilityService.displayListFacility();
        System.out.println("Nhập mã dịch vụ: ");
        String serviceCode = scanner.nextLine();
        
    }

    @Override
    public void displayListBooking() {
        for (Booking b : bookingList) {
            System.out.println(b);
        }
    }

    @Override
    public void createNewContract() {

    }

    @Override
    public void displayListContracts() {

    }

    @Override
    public void editContracts() {

    }

    @Override
    public void display() {

    }

    @Override
    public Integer add() {

        return null;
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void returnMainMenu() {

    }
}
