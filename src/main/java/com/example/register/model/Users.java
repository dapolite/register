package com.example.register.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Users {

    @Id
    private String userid;
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String dateofbirth;
    private String password;

    public Users(){}

    public Users(String userid, String firstname, String lastname, String email, String phonenumber, String dateofbirth, String password) {
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.dateofbirth = dateofbirth;
        this.password = password;
    }


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
