package BT_javabasic5;

import java.util.ArrayList;

public class BT4_ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> sochan = new ArrayList<>();
        for (int i = 0; i <= 50; i+=2){
            System.out.println(i);
            sochan.add(i);
        }
        System.out.println("**************");
        for (int i = 0; i < sochan.size(); i++){
            System.out.println(sochan.get(i));
        }
    }
}
