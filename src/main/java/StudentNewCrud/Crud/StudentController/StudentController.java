package StudentNewCrud.Crud.StudentController;


import StudentNewCrud.Crud.Model.Student;
import StudentNewCrud.Crud.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
    public class StudentController {
    @Autowired     // for auto-wiring from controller to service
    private StudentService service;

    // for adding student
            @RequestMapping(value = "/add",method = RequestMethod.POST)
            public String AddStudent(@RequestBody Student student1){

                return service.AddStu(student1);
    }

    // for displaying student
            @RequestMapping(value = "/get",method = RequestMethod.GET)
            public ArrayList <Student> GetStudentData(){
            return service.GetStu();
    }


    // for updating data of student
            @RequestMapping(value = "/update",method = RequestMethod.PUT)
            public String updateStuData(@RequestParam String name , @RequestParam Long id) {
            return service.updateStu(name, id);}

   // for deleting data of students
            @RequestMapping(value = "/delete{index}",method = RequestMethod.DELETE)
            public String Remove(@PathVariable Long index){
            return service.Remove(index);
    }
}
