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
}
