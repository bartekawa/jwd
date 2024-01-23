package vars;

public class Squares {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        a = 2; //kwadrat 1

        System.out.println("Kwadrwat o długości boku równej " + a + " .");
        System.out.println(" - obwód " + (4 * a));
        System.out.println(" - pole powierzchni " + (a * a));
        System.out.println(" - długość przekątnej " + (a * Math.sqrt(2)));

        b = 7; //kwadrat 2

        System.out.println("Kwadrwat o długości boku równej " + b + " .");
        System.out.println(" - obwód " + (4 * b));
        System.out.println(" - pole powierzchni " + (b * b));
        System.out.println(" - długość przekątnej " + (b * Math.sqrt(2)));

        c = 11; //kwadrat 3

        System.out.println("Kwadrwat o długości boku równej " + c + " .");
        System.out.println(" - obwód " + (4 * c));
        System.out.println(" - pole powierzchni " + (c * c));
        System.out.println(" - długość przekątnej " + (c * Math.sqrt(2)));

        d = 19; //kwadrat 4

        System.out.println("Kwadrwat o długości boku równej " + d + " .");
        System.out.println(" - obwód " + (4 * d));
        System.out.println(" - pole powierzchni " + (d * d));
        System.out.println(" - długość przekątnej " + (d * Math.sqrt(2)));
    }
}
