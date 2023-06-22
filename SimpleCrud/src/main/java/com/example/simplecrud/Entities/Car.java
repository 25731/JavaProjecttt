package com.example.simplecrud.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Represents a Car entity with fields id, brand, and model.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    /**
     * The unique identifier of the car.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The brand of the car.
     */
    private String brand;

    /**
     * The model of the car.
     */
    private String model;
}