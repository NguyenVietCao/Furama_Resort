package services.impl;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
    static HouseService houseService = new HouseService();
    static RoomService roomService = new RoomService();
    static VillaService villaService = new VillaService();
    static LinkedHashMap<Facility, Integer> useService = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        Facility h1 = new House("H1", "65m2", "1200000vnd", "6", "Năm", "3 Sao", "3");
        Facility v1 = new Villa("V1", "150m2", "3000000", "8", "tháng", "4 sao", "200m2", "1");
        Facility r1 = new Room("R1", "30m2", "800vnd", "2", "2 sao", "water");
        useService.put(h1, 0);
        useService.put(v1, 0);
        useService.put(r1, 0);
    }

    @Override
    public void displayListFacility() {
        Set<Facility> set = useService.keySet();
        for (Facility key : set) {
            System.out.println(key + " " + useService.get(key));
        }

    }

    @Override
    public void addNewFacility() {
        boolean check = true;
        do {
            System.out.println("Nhập số để chọn dịch vụ \n" +
                    "1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    villaService.add();
                    break;
                case 2:
                    houseService.add();
                    break;
                case 3:
                    roomService.add();
                    break;
                case 4:
//                    returnMainMenu();
                    check = false;
                    break;

                default:
                    System.out.println("Bạn nhập sai xin mời nhập lại");
            }
        }
        while (check);

    }


    @Override
    public void displayListFacilityMaintenance() {

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

    public static Facility applyInformation(String typeOf) {
        Facility facility = new Facility();
        return null;
    }

}


