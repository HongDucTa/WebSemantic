package WebSemantic;

import org.apache.jena.Jena;

import java.io.FileNotFoundException;
import java.io.IOException;

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

        //jena1.main();
        //jena2.main();

        jena4.main();

    }
}
