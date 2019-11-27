package com.java.community.utils;

import com.github.database.rider.core.api.dataset.DataSetProvider;
import com.github.database.rider.core.dataset.builder.DataSetBuilder;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;

public class UserDataset implements DataSetProvider {
    @Override
    public IDataSet provide() throws DataSetException {
        return new DataSetBuilder()
                .table("users")
                .columns("id", "first_name", "last_name", "email")
                .values(1, "John", "Doe", "j.d@gg.com")
                .values(2, "Mary", "Jackson", "mjackson@gg.com")
                .values(3, "Adam", "Smith", "asmith@gg.com")
                .build();
    }
}
