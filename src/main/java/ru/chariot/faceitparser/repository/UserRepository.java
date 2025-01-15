package ru.chariot.faceitparser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chariot.faceitparser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
