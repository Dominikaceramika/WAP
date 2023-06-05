package com.uep.wap.dto;

import com.uep.wap.model.Player;

import java.util.Date;
import java.util.List;

public class MatchDTO {
    private int id;
    private String category;
    private String score;
    private Date matchDate;
    private String court;
    private List<Player> playerList;
    private String referee;
    public MatchDTO(int id, String category, String score, Date matchDate, String court, List<Player> playerList,
                    String referee) {
        this.id = id;
        this.category = category;
        this.score = score;
        this.matchDate = matchDate;
        this.court = court;
        this.playerList = playerList;
        this.referee = referee;
    }
    // Gettery i settery
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public Date getMatchDate() {
        return matchDate;
    }
    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }
    public String getCourt() {
        return court;
    }
    public void setCourt(String court) {
        this.court = court;
    }
    public List<Player> getPlayerList() {
        return playerList;
    }
    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
    public String getReferee() {
        return referee;
    }
    public void setReferee(String referee) {
        this.referee = referee;
    }
}