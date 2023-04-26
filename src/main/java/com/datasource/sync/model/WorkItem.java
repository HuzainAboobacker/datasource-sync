package com.datasource.sync.model;

import javax.persistence.*;

@Entity
@Table
public class WorkItem {
    @Id
    @Column
    private Integer workItemID;
    @Column
    private String workItemName;
    @Column
    private String workItemTitle;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="projectID")
    private Project project;

    public Integer getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Integer workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemName() {
        return workItemName;
    }

    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
    }

    public String getWorkItemTitle() {
        return workItemTitle;
    }

    public void setWorkItemTitle(String workItemTitle) {
        this.workItemTitle = workItemTitle;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
