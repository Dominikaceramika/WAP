package com.uep.wap.dto;

import java.util.Date;
import java.util.List;
public class PlayerDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private Date birthDate;
    private String password;
    private List<MatchDTO> matchDTOList;
    public PlayerDTO(int id, String firstName, String lastName, String gender, String email, Date birthDate,String password, List<MatchDTO>
            matchDTOList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.birthDate = birthDate;
        this.password = password;
        this.matchDTOList = matchDTOList;
    }
    // Gettery i settery
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}
    public List<MatchDTO> getMatchList() {
        return matchDTOList;
    }
    public void setMatchList(List<MatchDTO> matchDTOList) {
        this.matchDTOList = matchDTOList;
    }
}