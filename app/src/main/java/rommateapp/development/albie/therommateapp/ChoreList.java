package rommateapp.development.albie.therommateapp;

import java.util.ArrayList;

/**
 * The ChoreList is a collection of Chore objects
 * Chore objects can be added to this list.
 * Every Chorelsit has a unique Id.
 * Every group can only have one groceryList.
 *
 * Created by alexgreco on 10/20/15.
 */
public class ChoreList {
    public int choreListId;
    public ArrayList<Chore> choresList;

    public ChoreList(ArrayList<Chore> choresList) {
        this.choresList = choresList;
    }

    public int getChoreListId() {
        return choreListId;
    }

    public void setChoreListId(int choreListId) {
        this.choreListId = choreListId;
    }

    public ArrayList<Chore> getChores() {
        return choresList;
    }

    public void setChores(ArrayList<Chore> choresList) {
        this.choresList = choresList;
    }

    public void addChore(Chore chore){
        choresList.add(chore);
    }

    public boolean isEmpty() {
        return choresList.isEmpty();
    }

}
