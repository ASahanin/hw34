package hw34;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> song = new ArrayList<>();
        String line1 = "Ветер с моря дул";
        String line2 = "Нагонял беду";
        String line3 = "И сказал ты мне";
        String line4 = "Больше не приду";
        song.add(0, line1);
        song.add(1, line2);
        song.add(2, line3);
        song.add(3, line4);

        ArrayList<String> song2 = new ArrayList<>();
        for (int i = 0; i < song.size(); i++) {
            for (int j = 0; j < 2; j++) {
                song2.add(song.get(i));
            }
        }
        System.out.println(song2);
        ArrayList<String> song3 = new ArrayList<>();
        int count = 13;
        for (int i = 0; i < song2.size(); i++) {
            if (song2.get(i).length() > count){
                song3.add(song2.get(i));
            }
        }
        System.out.println(song3);
        ArrayList<String> song4 = new ArrayList<>();
        String check = "И сказал ты мне";
        for (int i = 0; i < song2.size(); i++) {
            if (song2.get(i).contains(check)){
                song4.remove(song2.get(i));
            }
            else song4.add(song2.get(i));
        }
        System.out.println(song4);
    }
}

