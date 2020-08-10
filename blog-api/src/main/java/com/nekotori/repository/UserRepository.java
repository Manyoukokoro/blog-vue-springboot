package com.nekotori.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nekotori.entity.User;

/**
 * @author shimh
 * <p>
 * 2018年1月23日
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByAccount(String account);

}
