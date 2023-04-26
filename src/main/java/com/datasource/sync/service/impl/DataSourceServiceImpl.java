package com.datasource.sync.service.impl;

import com.datasource.sync.model.DataSource;
import com.datasource.sync.repository.DataSourceRepository;
import com.datasource.sync.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataSourceServiceImpl implements DataSourceService {
    @Autowired
    DataSourceRepository dataSourceRepository;
    @Override
    public DataSource getDataSourceById(int id) {
        return dataSourceRepository.findById(id).get();
    }
}
