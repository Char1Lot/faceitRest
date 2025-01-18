package ru.chariot.faceitparser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chariot.faceitparser.model.ParsedData;

import java.util.List;

@Repository
public interface ParsedDataRepository extends JpaRepository<ParsedData, Long> {
    List<ParsedData> findByUserName(String user);
    List<ParsedData> findByMap(String map);
}
