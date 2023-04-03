package services.impl;

import models.facility.Villa;
import services.IVillaService;

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
        super.add();
        // ,, , , , , String numberOfFloors
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

        System.out.println("Enter poolArea");
        String poolArea = scanner.nextLine();

        System.out.println("Enter numberOfFloors");
        String numberOfFloors = scanner.nextLine();

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
