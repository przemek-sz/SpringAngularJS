package com.springrest.service;

import com.springrest.model.User;
import com.springrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemek on 25.07.2017.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }
//////////////////////////////////////////////////////////////////////
    public void updateUser(User user) {
        userRepository.save(user);
    }

//////////////////////////////////////////////////
    public User getByEmail(String email) {

        return userRepository.findByEmail(email);
    }
    //////////////////////////////////////////////////
    public User getById(Long id) {

        return userRepository.findById(id);
    }
//////////////////////////////////////////////////
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        users = userRepository.findAll();

        return users;
    }
    /////////////////////////////////////////
    public void removeUser(Long id) {

        userRepository.delete(id);

    }
}
