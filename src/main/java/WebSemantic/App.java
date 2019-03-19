package WebSemantic;

import org.apache.jena.Jena;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        Jena1 jena1 = new Jena1();
        Jena2 jena2 = new Jena2();
        Jena3 jena3 = new Jena3();
        Jena4 jena4 = new Jena4();
        Jena5 jena5 = new Jena5();
        Jena6 jena6 = new Jena6();

        Scanner reader = new Scanner(System.in);


        while (true) {
            System.out.print("Choix de l'exercice (1-6) : ");
            String choice = reader.nextLine();
            switch (choice) {
                case "1": {
                    jena1.main();
                    break;
                }
                case "2": {
                    jena2.main();
                    break;
                }
                case "3": {
                    jena3.main();
                    break;
                }
                case "4": {
                    jena4.main();
                    break;
                }
                case "5": {
                    jena5.main();
                    break;
                }
                case "6": {
                    jena6.main();
                    break;
                }
                default: {
                    System.out.println("Unrecognized choice.");
                    break;
                }
            }
        }

    }
}
