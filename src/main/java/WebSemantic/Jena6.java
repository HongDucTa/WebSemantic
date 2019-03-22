package WebSemantic;

import org.apache.jena.query.*;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.rulesys.GenericRuleReasoner;
import org.apache.jena.reasoner.rulesys.Rule;

import java.io.File;

public class Jena6 {
    public void main()
    {
        Model model = ModelFactory.createDefaultModel();
        String filePath = new File("").getAbsolutePath();
        // read the TTL file
        model.read(filePath + "\\src\\main\\data\\final.ttl");

        Reasoner reasoner = new GenericRuleReasoner(Rule.rulesFromURL(filePath + "\\src\\main\\data\\exercice6_rules.txt"));

        InfModel infModel = ModelFactory.createInfModel(reasoner,model);

        /*
        String queryString =
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
                        "PREFIX owl: <http://www.w3.org/2002/07/owl#> " +
                        "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +
                        "PREFIX : <http://www.semanticweb.org/julian/ontologies/2019/2/untitled-ontology-3#>" +
                        "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " +
                        "SELECT ?title " +
                        "WHERE { " +
                        "?movie :isMoreThan15YearsOld :MoreThan15YearsOld ." +
                        "?movie :hasTitle ?title ." +
                        "}";
        */

        String queryString =
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
                        "PREFIX owl: <http://www.w3.org/2002/07/owl#> " +
                        "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +
                        "PREFIX : <http://www.semanticweb.org/julian/ontologies/2019/2/untitled-ontology-3#>" +
                        "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " +
                        "SELECT ?name " +
                        "WHERE { " +
                        "?person :isQuadragenaire :Quadragenaire ." +
                        "?person :hasName ?name ." +
                        "}";

        Query query = QueryFactory.create(queryString);

        QueryExecution qe = QueryExecutionFactory.create(query,infModel);
        ResultSet results = qe.execSelect();

        if (results.hasNext())
        {
            ResultSetFormatter.out(System.out,results,query);
        }
        else
        {
            System.out.println("No result found.");
        }

        qe.close();

        System.out.println("\nFin Exercice 6\n");
    }
}
