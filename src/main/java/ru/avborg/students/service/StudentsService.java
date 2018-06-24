package ru.avborg.students.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.avborg.students.da.entity.StudentEntity;
import ru.avborg.students.da.service.StudentsDaService;
import ru.avborg.students.service.mappers.StudentsMapper;
import ru.avborg.students.service.model.StudentModel;

import java.util.List;

@Service
public class StudentsService implements IService<StudentModel> {
    private StudentsDaService daService;
    private StudentsMapper studentsMapper = Mappers.getMapper(StudentsMapper.class);

    @Autowired
    public void setDaService(StudentsDaService daService) {
        this.daService = daService;
    }


    @Override
    public void save(StudentModel model) {
        daService.save(studentsMapper.toEntity(model));
    }

    @Override
    public StudentModel get(long id) {
        return studentsMapper.toModel(daService.get(id, StudentEntity.class));
    }

    @Override
    public List<StudentModel> getAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException();
    }
}
