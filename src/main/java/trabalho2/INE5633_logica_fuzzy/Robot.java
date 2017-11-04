package trabalho2.INE5633_logica_fuzzy;

import java.util.Date;

/**
 * Created by shekhargulati on 09/06/14.
 */
public class Robot {

    private String id;
    private String title;
    private boolean done;
    private Date createdOn = new Date();

    public Robot( ) {
        
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
}
