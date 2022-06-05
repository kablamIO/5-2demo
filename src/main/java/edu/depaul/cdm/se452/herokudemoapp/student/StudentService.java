package edu.depaul.cdm.se452.herokudemoapp.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> findAll() {
        return repo.findAll();
    }

    public Optional<Student> find(long id) {
        return repo.findById(id);        
    }

    public void save(Student student) {
        repo.save(student);
    }
    
}
