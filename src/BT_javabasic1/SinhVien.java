package BT_javabasic1;

public class SinhVien {
    String Khoa = "Địa Lý";  //Biến toàn cục
    public static String Lop = "GIS";
    public void getMaSV() {
        String MaSV = "001";      // Biến cục bộ
        System.out.println("MaSV: " + MaSV);
    }
    public void getKhoa(){
        System.out.println("Khoa: " + Khoa);
    }
    public static void main(String[] args) {
        SinhVien masv = new SinhVien();
        masv.getMaSV();
        SinhVien khoa = new SinhVien();
        khoa.getKhoa();
        System.out.println("Lớp: " + Lop);
        System.out.println( "Tên: " + ThongTin.Ten);
        System.out.println( "Tuổi: " + ThongTin.Tuoi);
        System.out.println( "Địa chỉ: " + ThongTin.DiaChi);
    }
}
