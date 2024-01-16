package com.Harshita.fullstackbackend.repository;

import com.Harshita.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
