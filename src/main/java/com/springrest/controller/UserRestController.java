
package com.springrest.controller;

import com.springrest.model.User;
import com.springrest.repository.UserRepository;
import com.springrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemek on 25.07.2017.
 */

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.POST)
    public void saveUser(@RequestBody User user) {
        userService.addUser(user);
        System.out.print("saveUser controller to");
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void updateUser(@PathVariable("id") Long id,@RequestBody User user) {

        User us=new User();
        us.setId( userService.getById(id).getId());
        us.setFirstName(user.getFirstName());
        us.setLastName(user.getLastName());
        us.setEmail(user.getEmail());
        userService.updateUser(us);

    }

    @RequestMapping(method = RequestMethod.GET)
    public List getAllUsers() {

        return userService.getAllUsers();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeUser(@PathVariable("id") Long id) {

        System.out.print("Usuwanie!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.print(id);
        userService.removeUser(id);

    }


}
