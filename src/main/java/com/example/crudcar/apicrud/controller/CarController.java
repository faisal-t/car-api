package com.example.crudcar.apicrud.controller;

import com.example.crudcar.apicrud.entities.CarEntity;
import com.example.crudcar.apicrud.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping(value = "cekapi")
    public String checkapi(){
        return "hello my friend";
    }

    @PostMapping(value = "add")
    public CarEntity addNewCar(@RequestBody CarEntity param){
        carRepository.save(param);
        return param;
    }

    @GetMapping(value = "getcar")
    public List<CarEntity> getAllCar(){
        return carRepository.findAll();
    }

    @GetMapping(value = "getcar/id")
    public CarEntity getById(@RequestParam int id){
        return carRepository.findById(id).get();
    }

    @PostMapping(value = "updatecar")
    public CarEntity updateById(@RequestBody CarEntity param){
        return carRepository.save(param);
    }

    @GetMapping(value = "deletecar")
    public String deleteById(@RequestParam int id){
        carRepository.deleteById(id);
        return "Succes Delete Car Where Id = " + id;
    }
}
