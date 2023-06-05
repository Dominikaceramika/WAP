package com.uep.wap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "courts")
public class TennisCourt {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "playerId")
    private Integer playerId;

    @Column(name = "location")
    private String location;


    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public void setPlayerId(Integer playerIdd){
        this.playerId = playerId;
    }
    public Integer getPlayerId(){
        return playerId;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
}
