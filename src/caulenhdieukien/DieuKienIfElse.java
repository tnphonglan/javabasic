package caulenhdieukien;

public class DieuKienIfElse {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        String message = "Add category successfully";

        if (number1 < number2 && message.equals("Add successfully")){
            System.out.println("Thỏa điều kiện");
        }
        else {
            System.out.println("Không thỏa điều kiện");
        }
    }
}
