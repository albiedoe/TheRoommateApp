package rommateapp.development.albie.therommateapp;

/**
 * The User class will hold all information about a single user
 * Created by alexgreco on 10/16/15.
 */
public class User {

    public int userId;
    public int groupId;
    public String fName = "";
    public String lName = "";
    public String emailAddress = "";
    public String phoneNumber= "";


    public User(int userId, String fName, String lName, String emailAddress, String phoneNumber, int groupId){
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
    }
    public User(String fName, String lName, String emailAddress, String phoneNumber, int groupId){
        this.fName = fName;
        this.lName = lName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "Name: " + fName + " " + lName + ", Phone Number: " + phoneNumber + ", Email Address:" + emailAddress;
    }

}
