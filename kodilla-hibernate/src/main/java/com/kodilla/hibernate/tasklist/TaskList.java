package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "LISTNAME", unique = true)
    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

