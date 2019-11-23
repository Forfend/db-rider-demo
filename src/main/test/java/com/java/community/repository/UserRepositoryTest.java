package com.java.community.repository;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.core.api.dataset.ExpectedDataSet;
import com.java.community.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class UserRepositoryTest extends BaseTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DataSet({"users.yml", "passports.xml"})
    public void testFind() {
        List<User> all = userRepository.findAll();
        assertFalse(all.isEmpty());
        assertEquals(3, all.size());
    }

    @Test
    @DataSet(cleanBefore = true)
    @ExpectedDataSet("user.yml")
    public void testSave() {
        userRepository.save(new User("Oleh", "Onufryk", "oleh.onufryk@gmail.com"));
    }
}