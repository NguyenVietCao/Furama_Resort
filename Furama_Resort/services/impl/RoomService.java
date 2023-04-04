package services.impl;

import models.facility.Room;
import services.IRoomService;
import utils.RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomService extends FacilityServiceImpl implements IRoomService {
    Scanner scanner = new Scanner(System.in);
    List<Room>rooms = new ArrayList<>();





    @Override
    public void display() {
        super.display();
    }

    @Override
    public Integer add() {
        super.add();
        do {
            System.out.println("Enter facility id: ");
            String facilityId = scanner.nextLine();
            if(RegEx.checkFacilityId(facilityId) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);
        // , ,,, String freeServiceIncluded

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

        System.out.println("Enter freeServiceIncluded");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,freeServiceIncluded);
        rooms.add(room);
        return FacilityServiceImpl.useService.put(room,0);
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
}
