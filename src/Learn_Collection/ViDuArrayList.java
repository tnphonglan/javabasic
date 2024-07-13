package Learn_Collection;


import java.util.ArrayList;

public class ViDuArrayList {
    public static void main(String[] args) {
        //Khai báo array list
        ArrayList<String> arrayList = new ArrayList<>();

        //Thêm phần tử vào Arraylist
        arrayList.add("Selenium");
        arrayList.add("Palayright");
        arrayList.add("Cypress");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");

        arrayList.add(1,"Katalon");
        arrayList.add(3,"akaAT Studio");

        //Duyệt phần tử trong Arraylist
        //Vòng lặp For
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Khai báo thêm 1 Arraylist thứ 2
        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("Java");
        arrayList2.add("Python");

        //Add all Arraylist2 vào Arraylist 1
        arrayList.addAll(arrayList2);
        System.out.println("**********************");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Remove 1 phần tử trong ArrayList
        arrayList.remove("Selenium");
        arrayList.remove(2);

        System.out.println("**********************");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Remove có điều kiện
        for (int i =0; i <arrayList.size(); i++){
            if(arrayList.get(i).equals("Selenium")){
                arrayList.remove(i);
            }
        }
        System.out.println("*******************");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Tìm kiếm giá trị phần tử
        System.out.println("***************");
        System.out.println(arrayList.contains("Java")); //Trả ra True nếu tìm thấy

    }
}
