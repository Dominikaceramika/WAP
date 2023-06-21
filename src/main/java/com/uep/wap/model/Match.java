package com.uep.wap.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @Column(name ="id")
    private Integer id;

    @Column(name = "category")
    private String category;

    @Column(name = "score")
    private String score;

    @Column(name = "match date")
    private String matchDate;

    @Column(name = "court")
    private String court;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "match_player",
                joinColumns = @JoinColumn(name = "match_id"),
                inverseJoinColumns = @JoinColumn(name = "player_id"))
    private List<Player> playerList;

    @Column(name = "referee")
    private String referee;

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
    public String getMatchDate() {
        return matchDate;
    }
    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }
    public String getCourt() {
        return court;
    }
    public void setCourt(String court) {
        this.court = court;
    }
    public List<Player> getPlayerList() {return playerList;}
    public void setPlayerList(List<Player> playerList) {this.playerList = playerList;}
    public String getReferee() {return referee;}
    public void setReferee(String referee) {this.referee = referee;}
}
