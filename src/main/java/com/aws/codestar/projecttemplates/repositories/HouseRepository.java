package com.aws.codestar.projecttemplates.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws.codestar.projecttemplates.model.House;

public interface HouseRepository extends JpaRepository<House,Integer> {
}
