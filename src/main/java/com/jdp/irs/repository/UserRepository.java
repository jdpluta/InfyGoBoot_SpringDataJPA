package com.jdp.irs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jdp.irs.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {}