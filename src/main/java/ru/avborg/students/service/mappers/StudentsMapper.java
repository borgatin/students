package ru.avborg.students.service.mappers;

import org.mapstruct.Mapper;
import ru.avborg.students.da.entity.StudentEntity;
import ru.avborg.students.service.model.StudentModel;

@Mapper
public interface StudentsMapper {

    StudentEntity toEntity(StudentModel model);

    StudentModel toModel(StudentEntity model);
}
