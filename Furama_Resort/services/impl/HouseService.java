package services.impl;

import models.Booking;
import models.facility.House;
import services.IHouseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class HouseService extends FacilityServiceImpl implements IHouseService {

    static Scanner scanner = new Scanner(System.in);

    List<House> houses = new ArrayList<>();


    @Override
    public void display() {
        super.display();
        for (House h:houses) {
            System.out.println(h);
        }
    }

    @Override
    public Integer add() {
        //, , , , , , String numberOfFloors



        System.out.println("Enter serviceName: ");
        String serviceName = scanner.nextLine();

        System.out.println("Enter usableArea");
        String usableArea = scanner.nextLine();

        System.out.println("Enter rentalCosts:");
        String rentalCosts = scanner.nextLine();

        System.out.println("Enter maximumNumberOfPeople:");
        String maximumNumberOfPeople = scanner.nextLine();

        System.out.println("Enter rentalType");
        String rentalType = scanner.nextLine();

        System.out.println("Enter roomStandard");
        String roomStandard = scanner.nextLine();

        System.out.println("Enter numberOfFloors");
        String numberOfFloors = scanner.nextLine();

        House house = new House(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);

        return FacilityServiceImpl.useService.put(house,0);
//        return BookingServiceImpl.bookingList.get(4).add(house.getServiceName());
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void delete() {
        super.delete();
    }

    @Override
    public void returnMainMenu() {
        super.returnMainMenu();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
