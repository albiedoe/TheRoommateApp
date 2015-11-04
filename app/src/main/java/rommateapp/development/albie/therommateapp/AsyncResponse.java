package rommateapp.development.albie.therommateapp;

/**
 * Created by Matthew on 11/3/2015.
 */
import java.util.ArrayList;
public interface AsyncResponse {
    void processFinish(ArrayList<Chore> output);
    void processFinish(GroceryList gl);
    void processFinish(MaintenanceList ml);
}
