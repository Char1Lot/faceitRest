package ru.chariot.faceitparser.service;

import org.springframework.stereotype.Service;
import ru.chariot.faceitparser.model.User;
import ru.chariot.faceitparser.repository.UserRepository;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }

    public User updateUser(Long id,User user){
        User updatedUser = userRepository.findById(id).get();

        updatedUser.setName(user.getName());

        return userRepository.save(updatedUser);
    }

    public User findById(Long id){
        return userRepository.findById(id).get();
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}