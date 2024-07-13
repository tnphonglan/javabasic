package BT_javabasic4;

public class VongLapFor_Mang {
    public static void main(String[] args) {
        int sochan [] = new int [26];
        int index = 0;
        for (int i = 0; i <= 50; i +=2)
       {
            System.out.println(i);
            sochan[index] = i;
            index++;
        }
        System.out.println("Các số chẵn đã lưu trong mảng");
        for (int i: sochan){
            System.out.println(i);
        }
        }
    }


