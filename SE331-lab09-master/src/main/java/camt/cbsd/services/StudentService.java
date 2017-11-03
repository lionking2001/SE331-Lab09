package camt.cbsd.services;

import camt.cbsd.entity.Student;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public interface StudentService {
    List<Student> getStudents();
    Student findById(long id);
    Student addStudent(Student student);
    Student addStudent(Student student, String imageFileName, BufferedImage image) throws IOException;
}
