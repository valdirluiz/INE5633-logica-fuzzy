package trabalho2.INE5633_logica_fuzzy;

import static spark.Spark.post;

/**
 * Created by shekhargulati on 09/06/14.
 */
public class RobotResource {

    private static final String API_CONTEXT = "/api/v1";


    public RobotResource( ) {
        setupEndpoints();
    }

    private void setupEndpoints() {
    	
        post(API_CONTEXT + "/todos", "application/json", (request, response) -> {
            response.status(201);
            return response;
        }, new JsonTransformer());

      
    }


}
