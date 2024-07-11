package BT_javabasic3;

public class BT_Toantu {
    public static void main(String[] args) {
        String Diachi1 = "Hồ Chí Minh";
        String Diachi2 = "Hà Nội";
        int n1 = 20;
        int n2 = 15;

        System.out.println(Diachi1 == Diachi2);
        System.out.println(n1 > n2);
        System.out.println(n1 < n2);
        System.out.println((Diachi1 == Diachi2) && (n1 < n2));
        System.out.println((Diachi1 == Diachi2) || (n1 > n2));
    }
}
