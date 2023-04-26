package com.datasource.sync.model;

import javax.persistence.*;

@Entity
@Table
public class DataSource {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer dataSorceID;
    @Column
    private String dataSource;
    @Column
    private String description;

    public DataSource() {
    }

    public Integer getDataSorceID() {
        return dataSorceID;
    }

    public void setDataSorceID(Integer dataSorceID) {
        this.dataSorceID = dataSorceID;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "dataSorceID=" + dataSorceID +
                ", dataSource='" + dataSource + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
