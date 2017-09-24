package com.springrest.service;

import com.springrest.model.User;
import com.springrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Przemek on 25.07.2017.
 */

public interface UserService {

    public void addUser(User user);
    public void updateUser(User user);
    public User getByEmail(String email);
    public User getById(Long id);
    public List getAllUsers();
    public void removeUser(Long id);


}
