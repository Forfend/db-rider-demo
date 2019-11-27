package com.java.community.repository;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.core.api.dataset.DataSetFormat;
import com.github.database.rider.core.api.dataset.ExpectedDataSet;
import com.github.database.rider.core.api.exporter.ExportDataSet;
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
    @DataSet(value = {"users.yml", "passports.xml"})
    //@DataSet(provider = UserDataset.class)
    public void testFind() {
        List<User> all = userRepository.findAll();
        assertFalse(all.isEmpty());
        assertEquals(3, all.size());
    }

    @Test
    @ExpectedDataSet("user.yml")
    public void testSave() {
        userRepository.save(new User("Oleh", "Onufryk", "oleh.onufryk@gmail.com"));
    }

    @Test
    @DataSet("users.yml")
    @ExportDataSet(format = DataSetFormat.JSON, outputName = "target/exported/users.json")
    public void testSaveAndExport(){
        userRepository.save(new User("Save", "User", "save.user@gmail.com"));
    }
}