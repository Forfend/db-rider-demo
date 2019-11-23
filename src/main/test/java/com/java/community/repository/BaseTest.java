package com.java.community.repository;

import com.github.database.rider.spring.api.DBRider;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
@Transactional
public abstract class BaseTest {
}
