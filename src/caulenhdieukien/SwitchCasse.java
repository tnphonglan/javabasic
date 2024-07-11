package caulenhdieukien;

public class SwitchCasse {
    public static void main(String[] args) {
        int number = 50;
        switch (number){
            case 10:
                System.out.println("10");
                break; // để thoát câu lệnh switch, không xét các trường hợp tiếp nữa
            case 20:
                System.out.println("20");
                break;
            case  30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20, 30");
        }
    }
}
