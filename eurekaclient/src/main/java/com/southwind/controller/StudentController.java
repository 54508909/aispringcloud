package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Value("${server.port}")
    private String port;

    @Autowired
    private StudentMapper studentMapper;


    @GetMapping("findAll")
    public Collection<Student> finAll(){
        return studentMapper.findAll();
    }



    @GetMapping("findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentMapper.findById(id);
    }


    @PostMapping("save")
    public void save(@RequestBody Student student){
        studentMapper.saveOrUpdate(student);
    }


    @PutMapping("update")
    public void update(@RequestBody Student student){
        studentMapper.saveOrUpdate(student);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentMapper.deleteById(id);
    }


    @GetMapping("index")
    public String index(){
        return "当前端口："+this.port;

    }
}
