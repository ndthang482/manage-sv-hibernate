package com.sat.satellite.Database.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "DEMO_1_Class", schema = "satellit_University")
public class ClassEntity {
    private int id;
    private String name;
    private String major;
    private Timestamp datecreated;

    public ClassEntity(){

    }

    public ClassEntity(int id, String name, String major, Timestamp datecreated) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.datecreated = datecreated;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "datecreated")
    public Timestamp getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Timestamp datacreated) {
        this.datecreated = datacreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassEntity that = (ClassEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(major, that.major) &&
                Objects.equals(datecreated, that.datecreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, major, datecreated);
    }
}
