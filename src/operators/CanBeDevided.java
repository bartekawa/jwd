package operators;

public class CanBeDevided {
    public static void main(String[] args) {

        int x = 7;
        int y = 5;

        int z = 35;

        boolean czyPodzielna = (z % x == 0 && z % y == 0);

        System.out.println(czyPodzielna);
    }
}
