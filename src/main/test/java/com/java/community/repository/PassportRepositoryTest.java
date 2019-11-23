package com.java.community.repository;

import com.github.database.rider.core.api.dataset.DataSet;
import com.java.community.entity.Passport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class PassportRepositoryTest extends BaseTest {

    @Autowired
    private PassportRepository passportRepository;

    @Test
    @DataSet({"users.yml", "passports.xml"})
    public void testFind() {
        List<Passport> all = passportRepository.findAll();
        assertFalse(all.isEmpty());
        assertEquals(2, all.size());
    }
}