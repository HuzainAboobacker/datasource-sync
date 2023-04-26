package com.datasource.sync.service;

import com.datasource.sync.model.Student;
import com.datasource.sync.model.WorkItem;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface WorkItemService {
    public WorkItem getWorkItemById(int WorkItemid);
    public void saveOrUpdateWorkItem(WorkItem workItem);
}
