package operators;

public class BinaryOperations {
    public static void main(String[] args) {

        int a = 0b11001;
        int b = 0b11101;
        int c = 0b00011;
        int d = 0b11010;

        boolean isCorrect = (a & b ^ c) == d;

        System.out.println("Czy działanie jest poprawne: " +isCorrect);
    }
}
