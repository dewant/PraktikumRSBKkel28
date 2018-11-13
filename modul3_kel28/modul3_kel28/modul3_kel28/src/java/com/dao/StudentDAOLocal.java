/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Student;
import javax.ejb.Local;

/**
 *
 * @author dewan
 */
@Local
public interface StudentDAOLocal {

    public void addStudent(Student student);

    public void editStudent(Student student);

    public void deleteStudent(int studentId);

    public Student getStudent(int studentId);

    public Object getAllStudents();
    
}
