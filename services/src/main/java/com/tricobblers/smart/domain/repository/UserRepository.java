package com.tricobblers.smart.domain.repository;

import com.tricobblers.smart.domain.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User, Long> {
    User findByLoginName(String loginName);
}
