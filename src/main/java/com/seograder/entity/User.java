package com.seograder.entity;

import com.seograder.utility.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user")
public class User {
    /* Note: if I did not use the exact same table name I would have to use @Column (name = "id") annotation */

    @Id // Denotes that this is the primary key
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Column(name = "Email")
    private String Email;

    @Column(name = "userPassword")
    private String userPassword;

    @Column(name = "FirstName")
    private String FirstName;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "PermissionType")
    private String PermissionType;

    @Convert (converter = LocalDateAttributeConverter.class)
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
