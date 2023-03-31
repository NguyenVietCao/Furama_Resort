package models.person;

public class Employee extends Person {
    //Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số
    //CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương

 private String employeeQualifications;
 private  String employeePosition;
 private float employeeSalary;

 public Employee(String employeeQualifications, String employeePosition, float employeeSalary) {
  this.employeeQualifications = employeeQualifications;
  this.employeePosition = employeePosition;
  this.employeeSalary = employeeSalary;
 }

 public Employee(String code, String name, String birthDay, String gender, String id, int numberPhone, String email, String employeeQualifications, String employeePosition, float employeeSalary) {
  super(code, name, birthDay, gender, id, numberPhone, email);
  this.employeeQualifications = employeeQualifications;
  this.employeePosition = employeePosition;
  this.employeeSalary = employeeSalary;
 }

 public String getEmployeeQualifications() {
  return employeeQualifications;
 }

 public void setEmployeeQualifications(String employeeQualifications) {
  this.employeeQualifications = employeeQualifications;
 }

 public String getEmployeePosition() {
  return employeePosition;
 }

 public void setEmployeePosition(String employeePosition) {
  this.employeePosition = employeePosition;
 }

 public float getEmployeeSalary() {
  return employeeSalary;
 }

 public void setEmployeeSalary(float employeeSalary) {
  this.employeeSalary = employeeSalary;
 }

 @Override
 public String toString() {
  return "Employee{" +
          "code='" + this.getCode() + '\'' +
          ", name='" + this.getName() + '\'' +
          ", birthDay='" + this.getBirthDay() + '\'' +
          ", gender='" + this.getGender() + '\'' +
          ", id='" + this.getId() + '\'' +
          ", numberPhone=" + this.getNumberPhone() +
          ", email='" + this.getEmail() + '\'' +
          "employeeQualifications='" + employeeQualifications + '\'' +
          ", employeePosition='" + employeePosition + '\'' +
          ", employeeSalary=" + employeeSalary +
          '}';
 }
 //Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám
//đốc.

   //Receptionist, waiter, specialist, supervisor, manager, director.
}
