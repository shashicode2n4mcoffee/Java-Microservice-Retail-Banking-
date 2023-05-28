package com.finance.reatilbankinguserservice.repository;

import com.finance.reatilbankinguserservice.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<UserEntity, Long> {
}
