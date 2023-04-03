package models.facility;

public class Room extends Facility{

    //- Riêng loại Room sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
    private String freeServiceIncluded;

    public Room(String freeServiceIncluded, String s, String s1) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}'+'\n';
    }
}
