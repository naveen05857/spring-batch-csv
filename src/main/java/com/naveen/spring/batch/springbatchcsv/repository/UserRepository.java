package com.naveen.spring.batch.springbatchcsv.repository;

import com.naveen.spring.batch.springbatchcsv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
