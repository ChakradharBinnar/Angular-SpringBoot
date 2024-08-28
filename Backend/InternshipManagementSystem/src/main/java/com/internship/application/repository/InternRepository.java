package com.internship.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internship.application.entity.InternEntity;

@Repository
public interface InternRepository extends JpaRepository<InternEntity, Integer> {

}
