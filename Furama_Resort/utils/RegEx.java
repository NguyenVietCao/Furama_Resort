package utils;

import java.util.Scanner;

public class RegEx {
    //- Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
    //- Nếu là Villa thì XX sẽ là VL
    //- Nếu là House thì XX sẽ là HO
    //- Nếu Room thì XX sẽ là RO
    //- Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường
    //- Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2
    //- Chi phí thuê phải là số dương
    //- Số lượng người tối đa phải &gt;0 và nhỏ hơn &lt;20
    //- Số tầng phải là số nguyên dương.
    //- Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch v
    //- Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi và
    //phải đúng định dạng dd/mm/YYYY (sử dụng User Exception)
    static final String FACILITY_CODE_REGEX = "^(SV)(VL||HO||RO)\\-[0-9]{4,}$";
    static final String SERVICE_NAME_REGEX = "^[A-Z][a-z]+$";
    static final  String USE_AREA_REGEX = "^([3-9][0-9])||([1-9][0-9]{2,})$";
    static final  String POOL_AREA_REGEX = "^([3-9][0-9])||([1-9][0-9]{2,})$";
    static final String RENTAL_COST_REGEX = "^[0-9]+$";
    static final String MIN_MAX_OF_PEOPLE_REGEX = "^[0-1][0-9]{0,}$";
    static final String FLOOR_REGEX = "^[0-9]+$";
    static final String RENTAL_TYPE_REGEX = "^[A-Z][a-z]+$";
    static final String ROOM_STANDARD_REGEX = "^[A-Z][a-z]+$";
    static final String BIRTHDAY_REGEX = "^(([0-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";

    static {

    }
    public static boolean checkFacilityId(String facilityId){
          return   facilityId.matches(FACILITY_CODE_REGEX);
    }
    public static boolean checkServiceName(String serviceName){
        return serviceName.matches(SERVICE_NAME_REGEX);
    }
    public static boolean checkUseArea(String useArea){
        return useArea.matches(USE_AREA_REGEX);
    }
    public static boolean checkPoolArea(String poolArea){
        return poolArea.matches(POOL_AREA_REGEX);
    }
    public static boolean checkRentalCost(String rentalCost){
        return rentalCost.matches(RENTAL_COST_REGEX);
    }
    public static boolean checkMinMaxOfPeople(String maximumNumberOfPeople){
        return maximumNumberOfPeople.matches(MIN_MAX_OF_PEOPLE_REGEX);
    }
    public static boolean checkRentalType(String rentalType){
        return rentalType.matches(RENTAL_TYPE_REGEX);
    }
    public static boolean checkRoomStandard(String roomStandard){
        return roomStandard.matches(ROOM_STANDARD_REGEX);
    }
    public static boolean checkFloor(String numberOfFloors){
        return numberOfFloors.matches(FLOOR_REGEX);
    }

}
