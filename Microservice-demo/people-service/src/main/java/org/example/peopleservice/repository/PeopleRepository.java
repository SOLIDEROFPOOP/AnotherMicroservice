package org.example.peopleservice.repository;

import org.example.peopleservice.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People , Integer> {

}
