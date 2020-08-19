package com.nekotori.repository;

import com.nekotori.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nekotori
 * <p>
 * 2018年4月18日
 */
public interface LogRepository extends JpaRepository<Log, Integer> {
}
