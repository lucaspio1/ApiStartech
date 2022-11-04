package com.codacum.apiolamundo.repository;


import org.springframework.stereotype.Repository;

import com.codacum.apiolamundo.entity.StartechEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StartechRepository  extends JpaRepository<StartechEntity, Integer> {
}
