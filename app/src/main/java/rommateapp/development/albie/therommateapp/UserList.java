package rommateapp.development.albie.therommateapp;

import java.util.ArrayList;

/**
 * Created by alexgreco on 11/1/15.
 */
public class UserList {
    public int userListId;
    public ArrayList<User> userList;
    public boolean isEmpty;

    public UserList(int userListId, ArrayList<User> userList, boolean isEmpty) {
        this.userListId = userListId;
        this.userList = userList;
        this.isEmpty = isEmpty;
    }

    public int getUserListId() {
        return userListId;
    }

    public void setUserListId(int userListId) {
        this.userListId = userListId;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public void addUser(User newUser){
        userList.add(newUser);
    }

    public Boolean removeUser(User user){
       return userList.remove(user);
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
}
