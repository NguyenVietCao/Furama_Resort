package services;

public interface IRoomService extends IFacilityService{
    @Override
    void displayListFacility();

    @Override
    void addNewFacility();

    @Override
    void displayListFacilityMaintenance();
}
