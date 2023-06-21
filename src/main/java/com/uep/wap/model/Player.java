package com.uep.wap.model;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="players")
public class Player {

    @Id
    @Column(name ="id")
    private Integer id;

    @Column(name = "firstName", nullable=false)
    private String firstName;

    @Column(name = "lastName", nullable=false)
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email", nullable=false, unique=true)
    private String email;

    @Column(name = "birthDate")
    private Date birthDate;

    @ManyToMany(mappedBy = "playerList")
    private List<Match> match;

    @Column(name = "password", nullable = false)
    private String password;


    //get i set
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password= password;}
}
