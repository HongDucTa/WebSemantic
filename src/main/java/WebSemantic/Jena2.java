package WebSemantic;

import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

import java.io.File;


public class Jena2 {
    public void main() {
        Model model = ModelFactory.createDefaultModel();

        String filePath = new File("").getAbsolutePath();

        // read the TTL file
        model.read(filePath + "\\src\\main\\data\\final.ttl", null);

        String queryString =
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
                        "PREFIX owl: <http://www.w3.org/2002/07/owl#> " +
                        "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +
                        "PREFIX : <http://www.semanticweb.org/julian/ontologies/2019/2/untitled-ontology-3#>" +
                        "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " +
                        "SELECT ?name " +
                        "WHERE { " +
                        "?x rdf:type owl:NamedIndividual ." +
                        "?x rdf:type :Person ." +
                        "?x :hasName ?name}";

        Query query = QueryFactory.create(queryString);

        QueryExecution qe = QueryExecutionFactory.create(query,model);
        ResultSet results = qe.execSelect();

        ResultSetFormatter.out(System.out,results,query);

        qe.close();

        System.out.println("\nFin Exercice 2\n");
    }
}
