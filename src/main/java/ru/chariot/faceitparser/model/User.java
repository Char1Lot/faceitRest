package ru.chariot.faceitparser.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "user")
    private List<ParsedData> parsedData;

    public User(String name, List<ParsedData> parsedData) {
        this.name = name;
        this.parsedData = parsedData;
    }

    public User(){};

    @Override
    public String toString() {
        return "{"+
                "\nuser : " + id +
                "\nname : " + name +
                "\n}";
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ParsedData> getParsedData() {
        return parsedData;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParsedData(List<ParsedData> parsedData) {
        this.parsedData = parsedData;
    }
}