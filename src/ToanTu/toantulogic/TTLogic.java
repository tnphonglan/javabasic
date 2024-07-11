package ToanTu.toantulogic;

public class TTLogic {
    public static void main(String[] args) {
        String message1 = "Login successful";
        String message2 = "Login successfully";
        int number1 = 10;
        int number2 = 20;
        int number3 = 10;
        //Toán tử VÀ &&
        /*
        - Toán tử VÀ chỉ đúng khi tất cả các điều kiện đều đúng. Ngược lại là sai.
        - Dùng để kết hợp các điều kiện lại với nhau theo kiểu tất c đều đúng
         */
        System.out.println((message1 == message2) && (number1 <= number2));

        // Toán tử HOẶC ||
        /*
        - Toán tử HOẶC chỉ đúng khi chỉ cần một trong các điều kiện đúng. Ngược lại chỉ sai khi tất cả các điều kiện đều sai
        - Dùng để kết hợp các điều kiện lại với nhau (trên cùng một loại điều kiện)
         */
        System.out.println(!((message1 == message2) || (number1 <= number2)));
    }
}
