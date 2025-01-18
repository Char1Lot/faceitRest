package ru.chariot.faceitparser.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "parsed_data")
public class ParsedData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    @JsonProperty("userName")
    private String userName;

    @JsonProperty("date")
    private String date;

    @JsonProperty("time")
    private String time;

    @Column(name = "game_type")
    @JsonProperty("type")
    private String type;

    @Column(name = "game_result")
    @JsonProperty("result")
    private String result;

    @JsonProperty("score")
    private String score;

    @Column(name = "game_map")
    @JsonProperty("map")
    private String map;

    public ParsedData(String userName, String date, String time, String type, String result, String score, String map) {
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
        return "{" +
                "\ngame : " + id +
                "\nuser : " + userName +
                "\ndate : " + date +
                "\ntime : " + time +
                "\ntype : " + type +
                "\nresult : " + result +
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

    public String getResult() {
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

    public void setResult(String result) {
        this.result = result;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setMap(String map) {
        this.map = map;
    }
}