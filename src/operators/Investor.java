package operators;

public class Investor {
    public static void main(String[] args) {

        int kwota = 14000;
        double kwota1 = kwota * 1.4;
        double kwota2 = kwota1 - 1500;
        double kwota3 = kwota2 + (0.12 * kwota2);

        System.out.println("Kwota w pierwszym roku = " + kwota1 + " zł.");
        System.out.println("Kwota w drugim roku = " + kwota2 + " zł.");
        System.out.println("Kwota w trzecim roku = " + kwota3 + " zł.");

    }
}
