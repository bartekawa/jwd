package loops;

public class Demo {
    public static void main(String[] args) {

       int a = 0;
       if (a > 0) {
           System.out.println("A jest większe od zera");
       } else if (a < 0){
           System.out.println("A jest mniejsze od zera");
       } else {
           System.out.println("A jest równe zero");
       }

       int myScore = 34;
       int yourScore = 44;
       int ourBestScore = myScore > yourScore ? myScore : yourScore;

        System.out.println("Najlepszy wynik to: " + ourBestScore);

    }
}
