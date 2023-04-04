package services.impl;

import models.Booking;
import models.facility.House;
import services.IHouseService;
import utils.RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseService extends FacilityServiceImpl implements IHouseService {

    static Scanner scanner = new Scanner(System.in);

    List<House> houses = new ArrayList<>();


    @Override
    public void display() {
        super.display();
        for (House h : houses) {
            System.out.println(h);
        }
    }

    @Override
    public Integer add() {
        //, , , , , , String numberOfFloors

//        System.out.println("Enter facility id: ");
//        String facilityId = scanner.nextLine();
//        if(RegEx.checkFacilityId(facilityId) == false) {
//            System.out.println("Wrong Format, Please Type Again.");
//            System.out.println("Enter facility id: ");
//             facilityId = scanner.nextLine();
//        }
        //  Kiểm tra mã dịch vụ:

        do {
            System.out.println("Enter facility id: ");
            String facilityId = scanner.nextLine();
            if (RegEx.checkFacilityId(facilityId) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);

        //Kiểm tra tên dịch vụ:
        String serviceName;
        do {
            System.out.println("Enter serviceName: ");
            serviceName = scanner.nextLine();
            if (RegEx.checkServiceName(serviceName) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);

        // Kiểm tra diện tích sử dụng:
        String usableArea;
        do {
            System.out.println("Enter usableArea");
            usableArea = scanner.nextLine();
            if (RegEx.checkUseArea(usableArea) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);

        // Kiểm tra giá thuê:
        String rentalCosts;
        do {

            System.out.println("Enter rentalCosts:");
            rentalCosts = scanner.nextLine();
            if (RegEx.checkRentalCost(rentalCosts) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);

        // Kiểm tra số người:
        String maximumNumberOfPeople ;
        do {
            System.out.println("Enter maximumNumberOfPeople:");
             maximumNumberOfPeople = scanner.nextLine();
            if (RegEx.checkMinMaxOfPeople(maximumNumberOfPeople) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);

        // Kiểm tra loại thuê:
        String rentalType;
        do {
            System.out.println("Enter rentalType:");
            rentalType = scanner.nextLine();
            if (RegEx.checkRentalType(rentalType) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);

        // Kiểm tra tiêu chuẩn phòng:
        String roomStandard;
        do {
            System.out.println("Enter roomStandard");
             roomStandard = scanner.nextLine();
            if (RegEx.checkRoomStandard(roomStandard) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);

        // Kiểm tra số tầng:
        String numberOfFloors;
        do {
            System.out.println("Enter numberOfFloors");
            numberOfFloors = scanner.nextLine();
            if (RegEx.checkFloor(numberOfFloors) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);


        House house = new House(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);

        return FacilityServiceImpl.useService.put(house, 0);
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
