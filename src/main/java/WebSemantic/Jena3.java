package WebSemantic;


import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

import java.io.File;

public class Jena3 {

    public void main()
    {
        String filePath = new File("").getAbsolutePath();
        Model model = JenaEngine.readModel(filePath + "\\src\\main\\data\\final.rdf");
        Model inferenceModel = JenaEngine.readInferencedModelFromRuleFile(model,filePath + "\\src\\main\\data\\final.rdf");
    }
}
