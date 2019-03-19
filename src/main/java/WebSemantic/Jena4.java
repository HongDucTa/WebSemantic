package WebSemantic;

import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Jena4 {

    public void main() throws IOException
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the name of the movie : ");
        String title = reader.nextLine();
        System.out.print(title);

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
                        "SELECT (GROUP_CONCAT(DISTINCT ?year; SEPARATOR=\", \") AS ?years) (GROUP_CONCAT(DISTINCT ?country; SEPARATOR=\", \") AS ?countries) (GROUP_CONCAT(DISTINCT ?genre; SEPARATOR=\" ; \") AS ?genres) (GROUP_CONCAT(DISTINCT ?actor; SEPARATOR=\", \") AS ?actors) " +
                        "WHERE { " +
                        "?x rdf:type owl:NamedIndividual ." +
                        "?x :hasTitle \"" + title +"\" ." +
                        "OPTIONAL {?x :hasCountry ?country .} ." +
                        "OPTIONAL {?x :hasYear ?year .} ." +
                        "OPTIONAL {?x :hasGenre ?genre .} ." +
                        "OPTIONAL {?x :hasActor ?actor .}" +
                        "}";

        Query query = QueryFactory.create(queryString);

        QueryExecution qe = QueryExecutionFactory.create(query,model);
        ResultSet results = qe.execSelect();

        ResultSetFormatter.out(System.out,results,query);

        qe.close();

        System.out.println("\nFin Exercice 4\n");

    }
}
