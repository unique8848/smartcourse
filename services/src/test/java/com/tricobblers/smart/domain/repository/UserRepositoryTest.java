package com.tricobblers.smart.domain.repository;

import com.tricobblers.smart.WebApplication;
import com.tricobblers.smart.domain.entity.User;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebApplication.class)
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void should_has_user_repository() throws Exception {
        assertThat(userRepository, Is.is(notNullValue()));
    }

    @Test
    public void should_create_and_find() throws Exception {
        userRepository.save(new User("login", "name", "psw"));
        final User byLoginName = userRepository.findByLoginName("login");
        assertThat(byLoginName.getLoginName(), is("login"));
    }


}