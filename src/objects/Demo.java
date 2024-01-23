package objects;

import java.awt.*;
import java.util.Locale;

public class Demo {
//    public static void main(String[] args) {
//        Object object = new Object();
//        String name = new String("Ala");
//        Point point = new Point(0, 0);

//    public static void main(String[] args) {
//        System.out.println(Math.max(23543, 23));

//    public static void main(String[] args) {
//
//        String s1, s2;
//        s1 = String.valueOf(550);
//        s2 = s1.valueOf(s1);
//
//        System.out.println(s1);
//        System.out.println(s2);

//    public static void main(String[] args) {
//
//        int accountBalance = 15005;
//        System.out.println(accountBalance);
//        System.out.printf(new Locale("us"),"Saldo: %,d zł%n", accountBalance);

    // s - strings
    // d - decimals integers
    // f - floating points
    // t - date / time
    // n - new line
    // bB - boolean

//    public static void main(String[] args) {
//
//        double pi = Math.PI;
//        System.out.println(pi);
//        System.out.printf(/*new Locale("us"),*/"%.11f%n", pi);
//    }

//    public static void main(String[] args) {

//        byte a = 7;
//        short b;
//        int c;
//
//        c = a; //konwersja niejawna
//        b = (short) c; //konwersja jawna - rzutowanie

//        int a = 5;
//        double b = 13,5;
//
//        double c = b / a; //konwersja niejawna
//        double c = b / (double) a; //konwersja jawna - rzutowanie

    public static void main(String[] args) {
//        String str1 = "Jakiś napis";
//        System.out.println(str1.getClass().getName());

        boolean check1 = "Teksas" instanceof String;
        Object object = new Object();
        boolean check2 = object instanceof String;
        boolean check3 = "Ala ma kota" instanceof String;
        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);
    }

}
