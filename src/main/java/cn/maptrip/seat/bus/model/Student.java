package cn.maptrip.seat.bus.model;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * Student Entity.
 */
public class Student implements Serializable {

    //列信息
    private Integer id;

    private String name;

    private Integer score;

    private LocalDateTime joinTime;


    public void setId(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return this.id;
    }


    public void setName(String value) {
        this.name = value;
    }

    public String getName() {
        return this.name;
    }


    public void setScore(Integer value) {
        this.score = value;
    }

    public Integer getScore() {
        return this.score;
    }


    public void setJoinTime(LocalDateTime value) {
        this.joinTime = value;
    }

    public LocalDateTime getJoinTime() {
        return this.joinTime;
    }

}

