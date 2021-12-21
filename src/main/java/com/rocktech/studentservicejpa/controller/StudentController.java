package com.rocktech.studentservicejpa.controller;

import com.rocktech.studentservicejpa.model.Book;
import com.rocktech.studentservicejpa.model.Student;
import com.rocktech.studentservicejpa.service.BookRepository;
import com.rocktech.studentservicejpa.service.StudentDao;
import com.rocktech.studentservicejpa.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentDao studentDao;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    BookRepository bookRepository;

    @PostMapping("saveStudent")
    public void saveStudent(@RequestBody Student student){
        studentDao.insertStudent(student);
    }

    @PostMapping("postStudent")
    public void postStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    @GetMapping("all")
    public List<Student> getAll(){
       return studentRepository.findAll();
    }

    @GetMapping("get/{id}")
    public Student getOne(@PathVariable Long id){
        return studentRepository.findById(id).get();
    }


    @PostMapping("postBook")
    public void postBook(@RequestBody Book book){
        bookRepository.save(book);
    }


    @GetMapping("getBook/{id}")
    public List<Book> getBook(@PathVariable Long id){
        Student student = studentRepository.findById(id).get();
        return student.getAllBooks();
    }
}
