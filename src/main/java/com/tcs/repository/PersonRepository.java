package com.tcs.repository;
import com.tcs.entity.Person;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
public interface PersonRepository<P> extends CrudRepository<Person, Long> {
    List<Person> findByFirstName(String firstName);
}