package com.example.monique.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findById(@Param("id") Long id);

    List<User> findAll();

    List<User> findByAge(@Param("age") Integer age);

    List<User> findByAgeLessThan(@Param("age") Integer age);

    List<User> findByName(@Param("name") String name);

    User findByNameAndAge(@Param("name") String name, @Param("age") Integer age);

    List<User> findByAgeAndGender(@Param("age") Integer age, @Param("gender") String gender);


}