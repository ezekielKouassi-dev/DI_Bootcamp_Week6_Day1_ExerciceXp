/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpweek6day1;

import di.atos.exercicexpweek6day1.exercice3.Circle;
import di.atos.exercicexpweek6day1.exercice4.Scrabble;
import java.util.Scanner;

/**
 *
 * @author ezekielkouassi
 */
public class ExerciceXpWeek6Day1 {

    public static void main(String[] args) {
        
        // début exercice 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the 1st angle");
        double angle1 = scanner.nextDouble();

        System.out.println("Please, enter the 2nd angle");
        double angle2 = scanner.nextDouble();

        System.out.println("Please, enter the 3rd andgle");
        double angle3 = scanner.nextDouble();

        if ((angle1 + angle2 + angle3) == 180) {
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is not a valid triangle.");
        }
        // fin exercice 1
        
        // début exercie 2
        System.out.println("Veuillez entrer le décallage horaire entre votre domicile et votre destination." +
                "\n(Entrez une valeur négative si la destination est en retard sur le domicile)");

        int decallageHorraire = scanner.nextInt();

        int heureDestinationNuit = decallageHorraire < 0 ? 24 + decallageHorraire : decallageHorraire;
        int heureDestinationJournee = 12 + decallageHorraire;

        System.out.println("Il sera " + heureDestinationJournee + "H à la destination lorsqu'il sera 12h au domicile " +
                "et il sera " + heureDestinationNuit + "H à la destination lorsqu'il sera 00H au domicile");
        // fin exercice 2
        
        // début Exercice 3
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        // fin exercice 3
        
        // début exercice 4
        new Scrabble().getScore("cabbage");
        // fin exercice 4
    }
}
