package ru.avborg.students.service.model;

import java.io.Serializable;
import java.util.Date;

public class StudentModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private Date birthdate;
    private String sex;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
