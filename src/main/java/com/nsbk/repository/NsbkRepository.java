package com.nsbk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsbk.entity.Former;

@Repository
public interface NsbkRepository extends JpaRepository<Former, Integer> {

}
