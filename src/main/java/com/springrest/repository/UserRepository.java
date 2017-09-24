package com.springrest.repository;

import com.springrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Przemek on 25.07.2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public User findByEmail(String email);
    public User findById(Long id);
}
