package services;

public interface IHouseService extends IFacilityService{

    @Override
    void displayListFacility();

    @Override
    void addNewFacility();

    @Override
    void displayListFacilityMaintenance();
}
