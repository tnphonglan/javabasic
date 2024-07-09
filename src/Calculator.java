public class Calculator {
    public static int tong2songuyen (int n1, int n2){
        return n1 + n2;
    }
    public static float tich2sothuc (float f1, float f2){
        return f1 * f2;
    }
    public static void main(String[] args) {
        System.out.println(tong2songuyen(10, 20));
        System.out.println(tich2sothuc(14.2546F, 45.254F));
    }
}
