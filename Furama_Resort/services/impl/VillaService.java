package services.impl;

import models.facility.Villa;
import services.IVillaService;
import utils.RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaService extends FacilityServiceImpl implements IVillaService {

    static Scanner scanner = new Scanner(System.in);
    List<Villa> villas = new ArrayList<>();



    @Override
    public void display() {
        super.display();
    }

    @Override
    public Integer add() {
        do {
            System.out.println("Enter facility id: ");
            String facilityId = scanner.nextLine();
            if(RegEx.checkFacilityId(facilityId) == true) {
                break;
            } else {
                System.out.println("Wrong Format, Please Type Again.");
            }
        } while (true);
        // ,, , , , , String numberOfFloors
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

        // Kiểm tra diện tích hồ bơi:
        String poolArea;
        do {
            System.out.println("Enter poolArea");
             poolArea = scanner.nextLine();
            if (RegEx.checkPoolArea(poolArea) == true) {
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

        Villa villa = new Villa(serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,poolArea,numberOfFloors);
        villas.add(villa);
        return FacilityServiceImpl.useService.put(villa,0);
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
