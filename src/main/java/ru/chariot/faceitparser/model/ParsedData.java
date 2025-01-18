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
    private String userName;

    private String date;

    private String time;

    private String type;

    private Boolean result;

    private String score;

    private String map;

    public ParsedData(String userName, String date, String time, String type, Boolean result, String score, String map) {
        this.userName = userName;
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
                "\nuser : " + userName +
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

    public String getUser() {
        return userName;
    }

    public String getDate() {
        return date;
    }

    public String  getTime() {
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

    public void setUser(String  user) {
        this.userName = user;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
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