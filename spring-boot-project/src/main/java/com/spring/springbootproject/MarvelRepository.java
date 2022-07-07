package com.spring.springbootproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarvelRepository extends JpaRepository<Marvel, Integer>{

}
