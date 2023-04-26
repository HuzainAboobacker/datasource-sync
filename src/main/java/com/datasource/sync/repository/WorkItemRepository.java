package com.datasource.sync.repository;

import com.datasource.sync.model.WorkItem;
import org.springframework.data.repository.CrudRepository;

public interface WorkItemRepository extends CrudRepository<WorkItem, Integer>
{
}