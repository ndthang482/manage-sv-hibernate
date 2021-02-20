package com.sat.satellite.Database.Repository;

import com.sat.satellite.Database.Entity.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentClassRepository extends JpaRepository<StudentClass, Integer> {
    @Query(value = "SELECT * FROM `DEMO_1_StudentClass` WHERE studentid=?1", nativeQuery = true)
    List<StudentClass> findByStudentID(int student_id);
    @Query(value = "SELECT * FROM `DEMO_1_StudentClass` WHERE classid=?1", nativeQuery = true)
    List<StudentClass> findByClassID(int class_id);
    @Query(value = "SELECT * FROM `DEMO_1_StudentClass` WHERE studentid=?1 AND classid=?2", nativeQuery = true)
    List<StudentClass> findByStudentIDAndClassID(int student_id,int class_id);
}
