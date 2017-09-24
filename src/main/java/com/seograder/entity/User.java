package com.seograder.entity;

import java.time.LocalDate;

public class User {
    private int id;
    private String Email;
    private String userPassword;
    private String FirstName;
    private String LastName;
    private String PermissionType;
    private LocalDate createDate;

    /**
     *  Instantiates a new user
     */
    public User() {
    }

    public User(int id, String Email, String userPassword, String FirstName, String LastName, String PermissionType, LocalDate createDate ) {
        this.id = id;
        this.Email = Email;
        this.userPassword = userPassword;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PermissionType = PermissionType;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPermissionType() {
        return PermissionType;
    }

    public void setPermissionType(String permissionType) {
        PermissionType = permissionType;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
