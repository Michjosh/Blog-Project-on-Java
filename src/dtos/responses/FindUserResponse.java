package dtos.responses;

import data.models.Users;

import java.util.Date;

public class FindUserResponse extends Users {
    private int userId;
    private String userName;
    private String fullName;
    private Date dateRegistered;

    @Override
    public String toString() {
        return "findUserResponse{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateRegistered='" + dateRegistered + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
}