package com.alexbusf.crudalexbusf.repositories;

import com.alexbusf.crudalexbusf.models.Thing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingRepository extends JpaRepository<Thing, Integer> {
}
