package com.example.simplecrud.Repo;


import com.example.simplecrud.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Repository interface for Car entity.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}