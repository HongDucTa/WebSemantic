package WebSemantic;

import org.apache.jena.query.*;

public class Jena2 {
    public void main() {
        String queryString = "SELECT ?x WHERE {?x <http://www.w3.org/2001/vcard-rdf/3.0#FN> \"John Smith\"}";
        Query query = QueryFactory.create(queryString);
        QueryExecution qexec = QueryExecutionFactory.create(query);
    }
}
