package models.person;

public abstract class Person {
    //Mã nhân viên, Họ tên, Ngày sinh, Giới tính, SốCMND, Số Điện Thoại, Email,
    private String code;
    private String name;
    private String birthDay;
    private String gender;
    private String id;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String code, String name, String birthDay, String gender, String id, String numberPhone, String email) {
        this.code = code;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.id = id;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
