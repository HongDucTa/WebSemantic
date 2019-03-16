package WebSemantic;


import org.apache.jena.base.Sys;

import java.io.*;

public class Jena1{

    public void main() throws FileNotFoundException, IOException
    {
        String filePath = new File("").getAbsolutePath();
        FileReader fileReader = new FileReader(filePath + "\\src\\main\\data\\PROJET_PROTEGE.owl");
        BufferedReader reader = new BufferedReader(fileReader);
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());

    }
}
