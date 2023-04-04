package models.facility;

public  class Facility {

    //Tên dịch vụ, Diện tích sử dụng, Chi phí
    //thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.

    private String serviceName;
    private String usableArea;
    private String rentalCosts;
    private String maximumNumberOfPeople;
    String rentalType;

    //Villa, House, Room.


    public Facility() {
    }

    public Facility(String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = String.valueOf(usableArea);
        this.rentalCosts = String.valueOf(rentalCosts);
        this.maximumNumberOfPeople = String.valueOf(maximumNumberOfPeople);
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String  getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(String maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "serviceName='" + serviceName +
                ", usableArea='" + usableArea +
                ", rentalCosts='" + rentalCosts +
                ", maximumNumberOfPeople='" + maximumNumberOfPeople +
                ", rentalType='" + rentalType +
                '}';
    }
}
