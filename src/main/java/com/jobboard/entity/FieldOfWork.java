package com.jobboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "field_of_work")
public class FieldOfWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="field_of_work_id")
    private int id;
    private String name;

    public FieldOfWork() {
    }

    public FieldOfWork(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
