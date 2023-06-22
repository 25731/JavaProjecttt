package com.example.simplecrud.Services;

import com.example.simplecrud.Entities.Car;
import com.example.simplecrud.Repo.CarRepository;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service class for managing cars.
 */
@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * Retrieves all cars from the database.
     *
     * @return a list of all cars
     */
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    /**
     * Retrieves a car with a given ID from the database.
     *
     * @param id the id of the car to retrieve
     * @return the car with the given id, or null if no such car exists
     */
    public Car getCar(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    /**
     * Creates a new car in the database.
     *
     * @param car the car to create
     * @return the created car
     */
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    /**
     * Updates an existing car in the database.
     *
     * @param car the car to update
     * @return the updated car
     */
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    /**
     * Deletes a car with a given ID from the database.
     *
     * @param id the id of the car to delete
     * @return true if the car was deleted, false if no car with the given id exists
     */
    public boolean deleteCar(Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return true;
        }
        return false;
    }
}