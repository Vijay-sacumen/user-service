package com.sacumen.microservices.user.repository;

import com.sacumen.microservices.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kumar Vijay
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserId(Long userId);
}
