package loops;

public class NumeralConverter {
    public static void main(String[] args) {
        System.out.println(convert3("dwójka"));
    }
    public static int convert3(String str) {
        return switch (str) {
            case "jeden", "jedynka" -> 1;
            case "dwa", "dwójka" -> 2;
            case "trzy", "trójka" -> 3;
            default -> 0;
        };
    }
}
