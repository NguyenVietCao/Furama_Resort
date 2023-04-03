package models.facility;

public class House extends Facility{

    //Riêng loại House sẽ có thêm thông tin: Tiêu chuẩn phòng, Số tầng.

    private String roomStandard;
    private String numberOfFloors;

    public House(String roomStandard, String numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType, String roomStandard, String numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                 super.toString() +
                ", rentalType='" + rentalType +
                ", roomStandard='" + roomStandard +
                ", numberOfFloors='" + numberOfFloors +
                ", rentalType='" + rentalType +
                '}' + '\n';
    }
}
