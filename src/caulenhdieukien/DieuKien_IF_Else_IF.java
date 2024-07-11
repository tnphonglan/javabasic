package caulenhdieukien;

public class DieuKien_IF_Else_IF {
    public static void main(String[] args) {
        double ĐTB = 5.5;
        if (ĐTB >= 8){
            System.out.println("Giỏi");
        } else if (ĐTB >= 6.5 && ĐTB < 8) {
            System.out.println("Khá");
        } else if (ĐTB >= 5 && ĐTB < 6.5){
            System.out.println("Trung bình");
        }else {
            System.out.println("Yếu");
            }
    }
}
