package org.yizhe.boot1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {

    // find keywords， And , Between, In, StaringWith
    List<Student> findByEmail(String email);

    List<Student> findByAgeBetween(int minAge, int maxAge);

    List<Student> findByNameStartingWith(String namePrefix);

    // Querying using SQL/JPQL
    @Query(value = "select new org.yizhe.boot1.dao.Student(name, email) from Student  where email = :email")
    List<Student> findByEmail2(@Param("email") String email);

}