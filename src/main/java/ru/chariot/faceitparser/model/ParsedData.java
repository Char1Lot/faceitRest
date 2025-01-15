package ru.chariot.faceitparser.model;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "parsed_data")
public class ParsedData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date date;

    private Time time;

    private String type;

    private Boolean result;

    private String score;

    private String map;

    public ParsedData(User user, Date date, Time time, String type, Boolean result, String score, String map) {
        this.user = user;
        this.date = date;
        this.time = time;
        this.type = type;
        this.result = result;
        this.score = score;
        this.map = map;
    }

    public ParsedData(){}

    @Override
    public String toString() {
        String s = result ? "win" : "lose";

        return "{" +
                "\ngame : " + id +
                "\nuser : " + user +
                "\ndate : " + date +
                "\ntime : " + time +
                "\ntype : " + type +
                "\nresult" + s +
                "\nscore : " + score +
                "\nmap : " + map +
                "\n}";
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public Boolean getResult() {
        return result;
    }

    public String getScore() {
        return score;
    }

    public String getMap() {
        return map;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setMap(String map) {
        this.map = map;
    }
}