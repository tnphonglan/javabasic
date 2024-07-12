package Mang;

public class MangMotChieu {
    public static void main(String[] args) {

        //Khai báo mảng lưu giá trị số nguyên
        int songuyen[] = new int [10];

        //Gán giá trị vào mảng
        songuyen[0] = 5; //gán giá trị 5 vào vị trí thứ nhất (mảng bắt đầu từ 0)
        songuyen[1] = 7;
        songuyen[6] = 10;

        //Gán giá trị bằng vòng ặp For
        for (int i = 0; i < songuyen.length; i++){
            songuyen[i] = 5;
        }

        System.out.println(songuyen[6]);

        //Truy xuất giá trị trong mảng
        for(int i = 0; i < 10; i++){
            System.out.println(songuyen[i]);
        }

    }
}
