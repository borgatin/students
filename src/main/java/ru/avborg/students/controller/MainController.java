package ru.avborg.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.avborg.students.service.StudentsService;
import ru.avborg.students.service.model.StudentModel;

import java.util.Date;

@Controller(value = "/")
public class MainController {

    private StudentsService studentsService;

    @Autowired
    public void setStudentsService(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        StudentModel studentModel = new StudentModel();
        studentModel.setName("Alex");
        studentModel.setBirthdate(new Date());
        studentModel.setSex("Мужской");

        studentsService.save(studentModel);
        return "index";
    }

}
