package BT_javabasic3;

public class BT_DieuKien_IF_Else_IF {
static int number = 100;
public static void compare (int n) {
    if (n == number ){
        System.out.println("TH1: n  == number");
    }else if (n < number) {
        System.out.println("TH2: n < number");
    }else {
        System.out.println("TH3: n > number");
    }
    }
    public static void main(String[] args) {
        compare(100);
        compare(50);
        compare(150);
    }
}

