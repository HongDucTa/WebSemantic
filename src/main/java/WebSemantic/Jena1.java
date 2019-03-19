package WebSemantic;

import java.io.*;


public class Jena1{

    public void main() throws IOException
    {
        String filePath = new File("").getAbsolutePath();
        FileReader fileReader = new FileReader(filePath + "\\src\\main\\data\\final.ttl");
        BufferedReader reader = new BufferedReader(fileReader);
        String content = "";
        String line = "";
        do {
            line = reader.readLine();
            if (line != null) {
                content = content + "\n" + line;
            }
        }
        while (line != null);
        //System.out.println(content);
        String listBlock[] = content.split("\\.\n");
        for (int i = 0;i < listBlock.length;i++)
        {
            if (listBlock[i].contains("rdf:type         :Person"))
            {
                System.out.println(listBlock[i]);
            }
        }

        System.out.println("\nFIN EXERCICE 1\n");

    }
}
