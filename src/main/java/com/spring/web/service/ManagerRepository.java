package com.spring.web.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Long>{

}
