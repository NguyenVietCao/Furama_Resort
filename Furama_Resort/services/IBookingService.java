package services;

public interface IBookingService extends IService {
    void addNewBooking();

    void displayListBooking();

    void createNewContract();

    void displayListContracts();

    void editContracts();
}
