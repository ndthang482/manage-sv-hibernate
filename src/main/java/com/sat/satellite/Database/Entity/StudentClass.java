package com.sat.satellite.Database.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DEMO_1_StudentClass", schema = "satellit_University")
public class StudentClass {
    private int id;
    private StudentEntity demo1StudentByStudentid;
    private ClassEntity demo1ClassByClassid;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClass that = (StudentClass) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    public StudentEntity getDemo1StudentByStudentid() {
        return demo1StudentByStudentid;
    }

    public void setDemo1StudentByStudentid(StudentEntity demo1StudentByStudentid) {
        this.demo1StudentByStudentid = demo1StudentByStudentid;
    }

    @ManyToOne
    public ClassEntity getDemo1ClassByClassid() {
        return demo1ClassByClassid;
    }

    public void setDemo1ClassByClassid(ClassEntity demo1ClassByClassid) {
        this.demo1ClassByClassid = demo1ClassByClassid;
    }
}
