package services;

public interface IVillaService extends IFacilityService{
    @Override
    void displayListFacility();

    @Override
    void addNewFacility();

    @Override
    void displayListFacilityMaintenance();
}
