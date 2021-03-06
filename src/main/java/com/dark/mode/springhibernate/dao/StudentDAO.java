package com.dark.mode.springhibernate.dao;

import com.dark.mode.springhibernate.model.Student;
import com.dark.mode.springhibernate.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface StudentDAO extends StudentRepository {
    @Transactional(readOnly = true)
    Iterable<Student> findByLastName(String lastName);

    @Transactional(readOnly = true)
    Optional<Student> findTopByEmailLike(String email);
}
