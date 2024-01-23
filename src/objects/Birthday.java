package objects;

import java.util.StringTokenizer;

public class Birthday {
    public static void main(String[] args) {

        String birthday = "29/04/2016";
        StringTokenizer stringTokenizer = new StringTokenizer(birthday, "/");
        System.out.println("Urodziny: " + birthday);
        System.out.println("Dzień: " + stringTokenizer.nextToken());
        System.out.println("Miesiąc: " + stringTokenizer.nextToken());
        System.out.println("Rok: " + stringTokenizer.nextToken());

    }
}
