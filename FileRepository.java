package com.rasool.design.shark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rasool.design.shark.model.Fileentity;

public interface FileRepository extends JpaRepository<Fileentity,Long>{

}
