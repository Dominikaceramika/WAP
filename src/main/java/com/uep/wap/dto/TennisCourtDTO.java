package com.uep.wap.dto;

public class TennisCourtDTO {
    private int id;
    private int playerId;
    private String location;
    public TennisCourtDTO(int id, int playerId, String location) {
        this.id = id;
        this.playerId = playerId;
        this.location = location;
    }
    // Gettery i settery
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
