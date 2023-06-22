package com.example.simplecrud.Controllers;

import com.example.simplecrud.Entities.Car;
import com.example.simplecrud.Services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    private final CarService carService;

    /**
     * Constructs a CarController with the provided CarService.
     *
     * @param carService the CarService to use for handling car-related operations
     */
    public CarController(CarService carService) {
        this.carService = carService;
    }

    /**
     * Handles GET requests for retrieving all cars.
     *
     * @return a list of all cars
     */
    @GetMapping
    public ResponseEntity<List<Car>> getCars() {
        return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
    }

    /**
     * Handles GET requests for retrieving a car by its ID.
     *
     * @param id the ID of the car to retrieve
     * @return the car with the provided ID, or a 404 status if no such car exists
     */
    @GetMapping("/{id}")
    public ResponseEntity<Car> getCar(@PathVariable Long id) {
        Car car = carService.getCar(id);
        if (car == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    /**
     * Handles POST requests for creating a new car.
     *
     * @param car the car to create
     * @return the created car
     */
    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return new ResponseEntity<>(carService.createCar(car), HttpStatus.CREATED);
    }

    /**
     * Handles PUT requests for updating an existing car.
     *
     * @param car the car to update
     * @return the updated car
     */
    @PutMapping
    public ResponseEntity<Car> updateCar(@RequestBody Car car) {
        return new ResponseEntity<>(carService.updateCar(car), HttpStatus.OK);
    }

    /**
     * Handles DELETE requests for deleting a car by its ID.
     *
     * @param id the ID of the car to delete
     * @return a 204 status if the car was deleted, or a 404 status if no such car exists
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        if (!carService.deleteCar(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}