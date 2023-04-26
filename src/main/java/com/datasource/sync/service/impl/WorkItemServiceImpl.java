package com.datasource.sync.service.impl;

import com.datasource.sync.model.WorkItem;
import com.datasource.sync.repository.WorkItemRepository;
import com.datasource.sync.service.WorkItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkItemServiceImpl implements WorkItemService {
    @Autowired
    WorkItemRepository workItemRepository;
    @Override
    public WorkItem getWorkItemById(int WorkItemid) {
        return workItemRepository.findById(WorkItemid).get();
    }

    @Override
    public void saveOrUpdateWorkItem(WorkItem workItem) {
        workItemRepository.save(workItem);
    }
}
