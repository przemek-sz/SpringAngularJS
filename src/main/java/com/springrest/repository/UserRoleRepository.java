package com.springrest.repository;

import com.springrest.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Przemek on 25.07.2017.
 */
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
}
