import java.util.Scanner;
import Exercise2.Exercise2Cars;
import Exercise2.Exercise2StationCar;

public class Repetition {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Exercise 1


        //Exercise 2 - exemplify the concept inheritance

        Exercise2Cars stationCar = new Exercise2Cars ("BMW", "red", 220, 50);
        System.out.println(stationCar);

        Exercise2StationCar Ferrari = new Exercise2StationCar("ferrari", "blue", 200, 170);
        System.out.println(Ferrari);

        //Exercise 3 -


        //Exercise 7 - explain the term static

        /*

        Static - a keyword that makes any method or class usable in other classes.


        */

    }
}
