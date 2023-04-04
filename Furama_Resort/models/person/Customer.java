package models.person;

public class Customer extends Person{
    //Mã khách hàng,
    //Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa
    //chỉ (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).

    private String customerType;
    private String customerAddress;
    //Loại Customer bao gồm: (Diamond, Platinum, Gold, Silver, Member).


    public Customer(String customerType, String customerAddress) {
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public Customer(String code, String name, String birthDay, String gender, String id, String numberPhone, String email, String customerType, String customerAddress) {
        super(code, name, birthDay, gender, id, numberPhone, email);
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code='" + this.getCode() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", birthDay='" + this.getBirthDay() + '\'' +
                ", gender='" + this.getGender() + '\'' +
                ", id='" + this.getId() + '\'' +
                ", numberPhone=" + this.getNumberPhone() +
                ", email='" + this.getEmail() + '\'' +
                "customerType='" + customerType + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }

    public String getInformationToCustomerCsv() {
        return this.getCode()+","+this.getName()+"," + this.getBirthDay() + "," + this.getGender() + "," +this.getId() + "," + this.getNumberPhone() + "," + this.getEmail() + "," + customerType + "," + customerAddress;
    }
}
