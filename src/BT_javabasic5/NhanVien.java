package BT_javabasic5;

import java.util.ArrayList;

public class NhanVien {
    String name;
    int age;
    String address;

    public NhanVien(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;

    }

    public String getAddress() {
        return address;

    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

    public static void main(String[] args) {

        NhanVien nv1 = new NhanVien("Lan", 33, "HCM");
        NhanVien nv2 = new NhanVien("Nam", 35, "HN");

        ArrayList<NhanVien> ListNhanVien = new ArrayList<>();
        ListNhanVien.add(nv1);
        ListNhanVien.add(nv2);

        for (NhanVien nv : ListNhanVien){
            System.out.println("***********");
            nv.printInfo();
        }


    }
}

