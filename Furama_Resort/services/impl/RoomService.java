package services.impl;

import models.facility.Room;
import services.IRoomService;

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
        // , ,,, String freeServiceIncluded
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
