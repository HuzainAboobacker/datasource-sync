package com.datasource.sync.repository;

import com.datasource.sync.model.DataSource;
import com.datasource.sync.model.WorkItem;
import org.springframework.data.repository.CrudRepository;

public interface DataSourceRepository extends CrudRepository<DataSource, Integer>
{
}