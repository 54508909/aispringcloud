package com.southwind.mapper;

import com.southwind.entity.Student;

import java.util.Collection;

public interface StudentMapper {

    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
