package ru.gb.Service2.service;

import org.springframework.stereotype.Service;
import ru.gb.Service2.model.User;
import ru.gb.Service2.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    public User getOne(int id) {
        return userRepository.getOne(id);
    }
}
