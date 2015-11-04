package rommateapp.development.albie.therommateapp;

import java.util.ArrayList;

/**
 * A GroceryList is a collection of grocery object.
 * a grocery can be added to this list.
 * Every GroeceryList has a uniqueId.
 * Every group can have one groceryList.
 *
 * Created by alexgreco on 10/21/15.
 */
public class GroceryList {


    public ArrayList<Grocery> groceryList;

    public GroceryList(ArrayList<Grocery> groceryList) {

        this.groceryList = groceryList;
    }


    public ArrayList<Grocery> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<Grocery> groceryList) {
        this.groceryList = groceryList;
    }

    public void addGrocery(Grocery grocery){
        groceryList.add(grocery);
    }

    public boolean isEmpty() {
        return groceryList.isEmpty();
    }

}
