package ru.chariot.faceitparser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chariot.faceitparser.model.ParsedData;

@Repository
public interface ParsedDataRepository extends JpaRepository<ParsedData, Long> {
}
