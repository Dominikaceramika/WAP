package com.uep.wap.dto;

public class AdministratorDTO {

    private int id;
    private String username;
    private String status;
    private String email;
    private int phone;

    public AdministratorDTO(int id, String username, String status, String email, int phone){
        this.id = id;
        this.username = username;
        this.status = status;
        this.email = email;
        this.phone = phone;
    }

    // Gettery i settery
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

}
