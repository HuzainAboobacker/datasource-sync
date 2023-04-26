package com.datasource.sync.resource;

import com.datasource.sync.model.DataSource;
import com.datasource.sync.model.Student;
import com.datasource.sync.model.WorkItem;
import com.datasource.sync.service.DataSourceService;
import com.datasource.sync.service.WorkItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSourceSyncController {
    @Autowired
    WorkItemService workItemService;
    @Autowired
    DataSourceService dataSourceService;

    @PostMapping("/workItem/save")
    private String saveWorkItem(@RequestBody WorkItem workItem)
    {
        System.out.println("DataSource : " + dataSourceService.getDataSourceById(1));
        workItemService.saveOrUpdateWorkItem(workItem);
        return "Successfully Saved";
    }

}
