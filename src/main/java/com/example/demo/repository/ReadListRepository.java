package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ReadList;

@Repository
public interface ReadListRepository extends JpaRepository<ReadList, Long> {
    // Add custom query methods if needed
}
