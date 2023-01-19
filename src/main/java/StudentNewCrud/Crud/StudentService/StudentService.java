package StudentNewCrud.Crud.StudentService;

import StudentNewCrud.Crud.Model.Student;
import StudentNewCrud.Crud.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;                   // for auto-wiring service to repository


    // logic for adding student in database
        public String AddStu(Student student1) {
        repository.save(student1);
        return "Student list added successfully....";
    }

    // logic for getting data from database
        public ArrayList<Student> GetStu() {
        return  (ArrayList<Student>) repository.findAll();
    }


    // logic for updating data in database
        public String updateStu(String name, Long id) {
        Student student1 = repository.getById(id);
        student1.setFname(name);
        repository.save(student1);
        return "Name updated successfully...." + name;
    }

        // logic for deleting data from database
        public String Remove(Long index) {
        repository.deleteById(index);
        return "Successfully deleted............. ";
    }
}